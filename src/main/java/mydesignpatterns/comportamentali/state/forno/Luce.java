package mydesignpatterns.comportamentali.state.forno;

public class Luce implements LuceIF {

    // Interfaccia State della luce
    private interface StatoLuceIF {

        default void on(Luce l) {
        }

        default void off(Luce l) {
        }
    }

    // Stati concreti della luce
    private enum StatoLuce implements StatoLuceIF {

        ON {
            @Override
            public void off(Luce l) {
                System.out.println("Luce off");
                l.transition(OFF);
            }
        },

        OFF {
            @Override
            public void on(Luce l) {
                System.out.println("Luce on");
                l.transition(ON);
            }
        }
    }

    private StatoLuceIF current = StatoLuce.OFF;

    private void transition(StatoLuceIF next) {
        current = next;
    }

    @Override
    public void switchOn() {
        current.on(this);
    }

    @Override
    public void switchOff() {
        current.off(this);
    }
}
