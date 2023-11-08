import java.util.ArrayList;

public class StreetOutsideHouse extends State{
private Model model;
	
	public StreetOutsideHouse(Model model) {
		this.model = model;
	}

	@Override
	public String getDescription() {
		String description = "You start the game on the street outside your house. School starts in 20 minutes. Do you want to go to school today?";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		ArrayList<String>getOptions = new ArrayList<String>();
		getOptions.add("Type 1 for yes");
		getOptions.add("Type 2 for no");
		return getOptions;
		
	}

	@Override
	public void processChoice(int choice) {
		if(choice == 1) {
			model.setCurrentState(StateType.OutsideSchoolBuilding);
		}
		if(choice == 2) {
			model.setCurrentState(StateType.EndOfGame);
		}
	}
}
