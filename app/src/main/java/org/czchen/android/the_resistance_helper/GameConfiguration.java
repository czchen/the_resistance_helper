package org.czchen.android.the_resistance_helper;

public class GameConfiguration {
    public enum MainModule {
        NO_MODULE,
        ASSASSIN_MODULE,
        HUNTER_MODULE,
    }

    public enum SetupPhase {
        // Everyone close your eyes and extend your hand into a fist in front of you
        BEGIN,

        // All players should have their eyes closed and hands in a fist in front of them
        RESET,

        // Everyone open your eyes
        END,

        // Spies open your eyes and look around to see your fellow Spies
        BEGIN_SPY_REVEAL,

        // Spies close your eyes
        END_SPY_REVEAL,

        // Spies - extend your thumb so the Commander will know you
        // Commander, open your eyes and see the Spies
        BEGIN_COMMMANDER_REVEAL,

        // Spies - put your thumbs down and re-form your hand into a fist
        // Commander, close your eyes
        END_COMMANDER_REVEAL,

        // Defectors open your eyes to reveal your counterpart
        BEGIN_DEFECTOR_REVEAL,

        // Defectors close your eyes
        END_DEFECTOR_REVEAL,

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
