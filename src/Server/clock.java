package Server;

public class clock {

    final static int ST_READY = 0;
    final static int ST_RUNNING = 1;
    final static int ST_HALTED = 2;
    final static int ST_EXIT = 3;

    int  state;         // one of {ST_READY, ST_HALT ... } //
    long startTime;     // stores start time
    long elapsedTime;   // stores elapsed time when
                        // halt command occurs

    public clock(){
        state = ST_READY; // initial state is ST_READY
        startTime = 0;
        elapsedTime = 0;

    }
    public void start(){
        if (state != ST_READY)
            throw new IllegalCmdException
                    ("'start' not allowed in the actual context");
        startTime = System.currentTimeMillis();
        state = ST_RUNNING;

    }

    public void reset(){

    }

    public long getTime(){

    }

    public void waitTime(long time){

    }

    public long halt(){

    }

    public void conTinue(){

    }
    public void exit(){

    }


*/
}
