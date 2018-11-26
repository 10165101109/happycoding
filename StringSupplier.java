package software_testing_homework_11;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.jupiter.api.Test;

public class StringSupplier extends ParameterSupplier{

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig)
	{
		List<PotentialAssignment> list = new ArrayList<PotentialAssignment> ();
		list.add(PotentialAssignment.forValue("String", "ECNU"));
		list.add(PotentialAssignment.forValue("String", "Fei"));
		list.add(PotentialAssignment.forValue("String", "Yan"));
		return list;
	}

}
