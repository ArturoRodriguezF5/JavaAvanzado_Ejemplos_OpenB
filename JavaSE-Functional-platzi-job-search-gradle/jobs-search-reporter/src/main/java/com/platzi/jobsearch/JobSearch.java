package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.API.APIJobs;
import com.platzi.jobsearch.CLI.CLIArguments;
import com.platzi.jobsearch.CLI.CLIFunctions;
import com.platzi.jobsearch.CLI.JobPosition;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.platzi.jobsearch.API.APIFunctions.buildAPI;
import static com.platzi.jobsearch.CLI.CommanderFunctions.buildJCommanderWithName;
import static com.platzi.jobsearch.CLI.CommanderFunctions.parseArguments;

public class JobSearch {
    public static void main(String[] args) {

        JCommander jCommander = buildJCommanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword() != null)
                        .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }
    private static Stream<JobPosition> executeRequest(Map<String, Object> params) {
        APIJobs api = buildAPI(APIJobs.class, "https://jobs.github.com");
        return Stream.of(params)
                .map(api::jobs)
                .flatMap(Collection::stream);
    }

}