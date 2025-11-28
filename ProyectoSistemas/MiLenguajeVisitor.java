// Generated from MiLenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#avanzar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanzar(MiLenguajeParser.AvanzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#girar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar(MiLenguajeParser.GirarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#detener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetener(MiLenguajeParser.DetenerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#esperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperar(MiLenguajeParser.EsperarContext ctx);
}