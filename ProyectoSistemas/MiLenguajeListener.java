// Generated from MiLenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void enterAvanzar(MiLenguajeParser.AvanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void exitAvanzar(MiLenguajeParser.AvanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#girar}.
	 * @param ctx the parse tree
	 */
	void enterGirar(MiLenguajeParser.GirarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#girar}.
	 * @param ctx the parse tree
	 */
	void exitGirar(MiLenguajeParser.GirarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#detener}.
	 * @param ctx the parse tree
	 */
	void enterDetener(MiLenguajeParser.DetenerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#detener}.
	 * @param ctx the parse tree
	 */
	void exitDetener(MiLenguajeParser.DetenerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(MiLenguajeParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(MiLenguajeParser.EsperarContext ctx);
}