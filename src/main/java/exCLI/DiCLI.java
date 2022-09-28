/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exCLI;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author Toy
 */
public class DiCLI {

    public static void main(String[] args) throws ParseException {
 // create Options object
Options options = new Options();
CommandLineParser parser = new DefaultParser();
CommandLine cmd = parser.parse(options, args);

// add t option
options.addOption("w", false, "Hola mundo");
options.addOption("c", false, "Este mundo es una mierda");
options.addOption("n", false, "Este mundo esta bien");
options.addOption("h", false, "Ayuda");
options.addOption("y", false, "Anios");

 Date date = new Date();

        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");

if(cmd.hasOption("w")) {
    System.out.println("Hola mundo");
}

    else if(cmd.hasOption("c")) {
        System.out.println("Este mundo es una mierda");
    }

    else if(cmd.hasOption("n")) {
        System.out.println("Este mundo esta bien");
    }
    else if(cmd.hasOption("h")) {
        System.out.println("Pulsa w, n o c para ejecutar una accion de este programa");
    }
    else if(cmd.hasOption("y")) {
          String currentYear = getYearFormat.format(date);
        System.out.println(currentYear);
    }
    else {
        System.err.getClass();
    }
  }
}
