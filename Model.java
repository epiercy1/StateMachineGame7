
public class Model {
private StateType currentState = StateType.StreetOutsideHouse;
	
	public StateType getCurrentState() {
		return currentState;
	}
	public void setCurrentState(StateType currentState) {
		this.currentState = currentState;
	}
}
