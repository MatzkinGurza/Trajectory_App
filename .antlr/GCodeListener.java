// Generated from c:/Documents/Poli/PI7/Trajectory_App/GCode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GCodeParser}.
 */
public interface GCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#programEnd}.
	 * @param ctx the parse tree
	 */
	void enterProgramEnd(GCodeParser.ProgramEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#programEnd}.
	 * @param ctx the parse tree
	 */
	void exitProgramEnd(GCodeParser.ProgramEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GCodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GCodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#detail}.
	 * @param ctx the parse tree
	 */
	void enterDetail(GCodeParser.DetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#detail}.
	 * @param ctx the parse tree
	 */
	void exitDetail(GCodeParser.DetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void enterLineNumber(GCodeParser.LineNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void exitLineNumber(GCodeParser.LineNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#codFunc}.
	 * @param ctx the parse tree
	 */
	void enterCodFunc(GCodeParser.CodFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#codFunc}.
	 * @param ctx the parse tree
	 */
	void exitCodFunc(GCodeParser.CodFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(GCodeParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(GCodeParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#delta_center}.
	 * @param ctx the parse tree
	 */
	void enterDelta_center(GCodeParser.Delta_centerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#delta_center}.
	 * @param ctx the parse tree
	 */
	void exitDelta_center(GCodeParser.Delta_centerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#stop_ms}.
	 * @param ctx the parse tree
	 */
	void enterStop_ms(GCodeParser.Stop_msContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#stop_ms}.
	 * @param ctx the parse tree
	 */
	void exitStop_ms(GCodeParser.Stop_msContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GCodeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GCodeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GCodeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GCodeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GCodeParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GCodeParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GCodeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GCodeParser.ParameterContext ctx);
}