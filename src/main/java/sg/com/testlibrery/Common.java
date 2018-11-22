package sg.com.testlibrery;

public class Common {

    // Type describing the state machine for Player balance request
    public enum SGPlayerBalanceState{
        // idle
        IDLE,
        // requesting the balance
        REQUESTING,
        // received the balance
        RECEIVED
    }

    public enum SGPlayerProfileState{
        UNAVAILABLE,    //set as unavailable by default when starting the session
        PINSETTINGAVAILABLE,      //fired when pin settings become available
        FUNDTRANSFERSETTINGAVAILABLE,      //fired when e cash settings become available
        LASTCASHOUTAVAILABLE      //fired when cashout becomes available
    }

    // Type describing the state machine for transfer funds request
    public enum SGFundsTransferState{
        // idle
        IDLE,
        // requesting the balance
        TRANSFERRING,
        // received the balance
        TRANSFERRED
    }


    public enum SGBLEConnectionState {
        IDLE,            //no connection established
        SCANNING,           //trying to connect to blue-tooth (scanning, beacon not receiving messages, etc)
        CONNECTING,     //after scanning it is attempting to connect to device
        CONNECTED,         //currently writing messages
        DISCONNECTING,       //attempting discoonnecting gatt
        DISCONNECTED     //gatt disconnected
    }
}
