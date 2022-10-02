/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exCLI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


/**
 *
 * @author Toilo
 */


public class Vista {

    private Controlador controlador;
    
    Vista(Controlador controlador){
        this.controlador=controlador;
    }
    
    public void menu (String [] args){
    //Fase de definición
    Options options = new Options();
        Option subir = Option.builder("s").hasArg()
                .desc("Sube la temperatura").build();
        Option bajar = Option.builder("b").hasArg()
                .desc("Baja la temperatura").build();
    OptionGroup group = new OptionGroup();
        group.addOption(subir);
        group.addOption(bajar);
        options.addOptionGroup(group);
        options.addOption("h", "help", false, "display help");
     ///////////////////////////////////// 2. FASE DE PARSEO
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            ///////////////////////////////////// 3. FASE DE INTERROGACIÓN
            // Si opción -h
            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("time", options);
            } else {
                // Si conversión a pesetas
                if (cmd.hasOption("s")) {
                   
                            cmd.getOptionValue("s");
                    controlador.();
                // Si conversión a euros
                } else if (cmd.hasOption("e")) {
                            cmd.getOptionValue("e");

                    controlador.getbajarTemp();
                }
            }

        } catch (ParseException ex) {
            System.err.println(ex.getLocalizedMessage());

        }
    
    
    
    
}

    void temp(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
