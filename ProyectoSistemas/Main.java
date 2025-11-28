import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // 1) Archivo de entrada
            CharStream input = CharStreams.fromFileName("entrada.txt");

            // 2) Lexer y Parser
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiLenguajeParser parser = new MiLenguajeParser(tokens);

            // 3) Parsear
            ParseTree tree = parser.programa();

            // 4) Visitor generador
            ScratchGeneratorVisitor visitor = new ScratchGeneratorVisitor();
            visitor.visit(tree);

            // 5) Guardar salida en JSON
            FileWriter out = new FileWriter("salida/scratch_output.json");
            out.write("[\n");

            for (int i = 0; i < visitor.blocks.size(); i++) {
                out.write("  " + visitor.blocks.get(i).toJSON());
                if (i < visitor.blocks.size() - 1) out.write(",");
                out.write("\n");
            }

            out.write("]");
            out.close();

            System.out.println("Traducción completada: scratch_output.json generado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
