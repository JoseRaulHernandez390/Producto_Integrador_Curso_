import java.util.ArrayList;
import java.util.List;

public class ScratchGeneratorVisitor extends MiLenguajeBaseVisitor<Void> {

    public List<ScratchBlock> blocks = new ArrayList<>();

    @Override
    public Void visitAvanzar(MiLenguajeParser.AvanzarContext ctx) {
        String pasos = ctx.INT().getText();
        blocks.add(new ScratchBlock("motion_movesteps", pasos));
        return null;
    }

    @Override
    public Void visitGirar(MiLenguajeParser.GirarContext ctx) {
        String direccion = ctx.getChild(2).getText();

        if(direccion.equals("izquierda"))
            blocks.add(new ScratchBlock("motion_turnleft", "15"));
        else
            blocks.add(new ScratchBlock("motion_turnright", "15"));

        return null;
    }

    @Override
    public Void visitDetener(MiLenguajeParser.DetenerContext ctx) {
        blocks.add(new ScratchBlock("control_stop", "all"));
        return null;
    }

    @Override
    public Void visitEsperar(MiLenguajeParser.EsperarContext ctx) {
        String segundos = ctx.INT().getText();
        blocks.add(new ScratchBlock("control_wait", segundos));
        return null;
    }
}
