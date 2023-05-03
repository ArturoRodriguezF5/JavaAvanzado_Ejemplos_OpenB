package com.platzi.jobsearch.CLI;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;


import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CommanderFunctions {

    public static <T> JCommander buildJCommanderWithName(String cliName, Supplier<T> argumentSuplier) {
        JCommander jCommander = JCommander.newBuilder()
                .addObject(argumentSuplier.get())
                .build();
        jCommander.setProgramName(cliName);
        return jCommander;
    }

    public static Optional<List<Object>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            Consumer<JCommander> onError
    ) {
        try {

        jCommander.parse((arguments));
        return Optional.of(jCommander.getObjects());
        } catch (ParameterException paramEx) {
            onError.accept(jCommander);
        }
        return Optional.empty();
    }
}
