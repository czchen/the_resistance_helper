package org.czchen.android.the_resistance_helper;

public class GameConfiguration {
    public enum MainModule {
        NO_MODULE,
        ASSASSIN_MODULE,
        HUNTER_MODULE,
    }

    private MainModule mainModule_ = MainModule.NO_MODULE;
    private int numberOfPlayers_ = 5;

    private boolean hasTrapperModule = false;
    private boolean hasDefectorModule = false;
    private boolean doDefectorsKnowEachOther = false;
    private boolean hasResistanceDummyAgent = false;
    private boolean hasResistanceCoordinator = false;
    private boolean hasSpyDeepAgentAndResistancePretender = false;
    private boolean hasInquistorModule = false;
    private boolean hasReverserModule = false;
    private boolean doesSpyReverserReveal = false;
}
