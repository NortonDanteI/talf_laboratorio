// Generated from gramatica_1.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatica_1Parser}.
 */
public interface gramatica_1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull gramatica_1Parser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull gramatica_1Parser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull gramatica_1Parser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull gramatica_1Parser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull gramatica_1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull gramatica_1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull gramatica_1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull gramatica_1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull gramatica_1Parser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull gramatica_1Parser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_1Parser#var_asignar}.
	 * @param ctx the parse tree
	 */
	void enterVar_asignar(@NotNull gramatica_1Parser.Var_asignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_1Parser#var_asignar}.
	 * @param ctx the parse tree
	 */
	void exitVar_asignar(@NotNull gramatica_1Parser.Var_asignarContext ctx);
}