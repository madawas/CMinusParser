package cminus.parser;

import cminus.grammar.CMinusLexer;
import cminus.grammar.CMinusParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Madawa
 */
public class Parser {

    private static final Logger LOGGER = Logger.getLogger(Parser.class.getName());
    public static final String AST = "--gen-ast";

    public static void main(String[] args) {
        System.setProperty("java.util.logging.SimpleFormatter.format","%4$s- %5$s%6$s%n");

        CMinusParser.ProgramContext context = null;
        CMinusParser parser = null;
        if (args.length > 0) {
            try {
                CharStream inputCharStream = new ANTLRInputStream(new FileInputStream(args[0]));
                TokenSource tokenSource = new CMinusLexer(inputCharStream);
                TokenStream inputTokenStream = new CommonTokenStream(tokenSource);
                parser = new CMinusParser(inputTokenStream);
                context = parser.program();
                LOGGER.log(Level.INFO, "Parsing finished.");
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Parsing Error: {0}",  e.getMessage());
            }
        } else {
            LOGGER.log(Level.SEVERE, "No input provided.");
            System.exit(0);
        }

        if (args.length > 1 && AST.equalsIgnoreCase(args[1])) {
            if (context != null) {
                displayAST(context, parser);
            }
        }

    }

    /**
     * Generates Abstract Syntax Tree for C-Minus grammar and displays.
     *
     * @param context ProgramContext
     * @param parser @link{CMinusParser} object
     */
    private static void displayAST(CMinusParser.ProgramContext context, CMinusParser parser) {
        LOGGER.log(Level.INFO, "Generating Abstract Syntax Tree");
        JFrame frame = new JFrame("CMinus Abstract Syntax Tree");
        JPanel panel = new JPanel();
        JScrollPane pane = new JScrollPane(panel);
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), context.getRuleContext());
        panel.add(viewer);
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
