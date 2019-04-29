// Generated from gramatica_2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatica_2Parser}.
 */
public interface gramatica_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#condicion_coma}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_coma(@NotNull gramatica_2Parser.Condicion_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#condicion_coma}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_coma(@NotNull gramatica_2Parser.Condicion_comaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull gramatica_2Parser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull gramatica_2Parser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#condicion_AND_OR}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_AND_OR(@NotNull gramatica_2Parser.Condicion_AND_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#condicion_AND_OR}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_AND_OR(@NotNull gramatica_2Parser.Condicion_AND_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull gramatica_2Parser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull gramatica_2Parser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(@NotNull gramatica_2Parser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(@NotNull gramatica_2Parser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull gramatica_2Parser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull gramatica_2Parser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull gramatica_2Parser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull gramatica_2Parser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#condicion_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_asc_desc(@NotNull gramatica_2Parser.Condicion_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#condicion_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_asc_desc(@NotNull gramatica_2Parser.Condicion_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#consulta}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(@NotNull gramatica_2Parser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#consulta}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(@NotNull gramatica_2Parser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull gramatica_2Parser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull gramatica_2Parser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull gramatica_2Parser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull gramatica_2Parser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2Parser#nombre_de_campo_coma}.
	 * @param ctx the parse tree
	 */
	void enterNombre_de_campo_coma(@NotNull gramatica_2Parser.Nombre_de_campo_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2Parser#nombre_de_campo_coma}.
	 * @param ctx the parse tree
	 */
	void exitNombre_de_campo_coma(@NotNull gramatica_2Parser.Nombre_de_campo_comaContext ctx);
}