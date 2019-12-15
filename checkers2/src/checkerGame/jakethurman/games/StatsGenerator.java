package checkerGame.jakethurman.games;

import checkerGame.jakethurman.components.SafeNode;
import checkerGame.jakethurman.foundation.Disposable;

// Interface for statistic generation
public interface StatsGenerator extends Disposable {
	public SafeNode getChart(StatChartType type);
	public String   getStatsText(int finalScore);
}
