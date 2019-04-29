// Generated from gramatica_2_SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatica_2_SQLParser}.
 */
public interface gramatica_2_SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#condicion_coma}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_coma(@NotNull gramatica_2_SQLParser.Condicion_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#condicion_coma}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_coma(@NotNull gramatica_2_SQLParser.Condicion_comaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull gramatica_2_SQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull gramatica_2_SQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#condicion_AND_OR}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_AND_OR(@NotNull gramatica_2_SQLParser.Condicion_AND_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#condicion_AND_OR}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_AND_OR(@NotNull gramatica_2_SQLParser.Condicion_AND_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull gramatica_2_SQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull gramatica_2_SQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(@NotNull gramatica_2_SQLParser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(@NotNull gramatica_2_SQLParser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull gramatica_2_SQLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull gramatica_2_SQLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull gramatica_2_SQLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull gramatica_2_SQLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#condicion_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_asc_desc(@NotNull gramatica_2_SQLParser.Condicion_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#condicion_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_asc_desc(@NotNull gramatica_2_SQLParser.Condicion_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#consulta}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(@NotNull gramatica_2_SQLParser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#consulta}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(@NotNull gramatica_2_SQLParser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull gramatica_2_SQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull gramatica_2_SQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull gramatica_2_SQLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull gramatica_2_SQLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_2_SQLParser#nombre_de_campo_coma}.
	 * @param ctx the parse tree
	 */
	void enterNombre_de_campo_coma(@NotNull gramatica_2_SQLParser.Nombre_de_campo_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_2_SQLParser#nombre_de_campo_coma}.
	 * @param ctx the parse tree
	 */
	void exitNombre_de_campo_coma(@NotNull gramatica_2_SQLParser.Nombre_de_campo_comaContext ctx);
}