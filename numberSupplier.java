package software_testing_homework_11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.jupiter.api.Test;

public class numberSupplier extends ParameterSupplier{

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig)
	{
		List<PotentialAssignment> list = new ArrayList<PotentialAssignment> ();
		list.add(PotentialAssignment.forValue("long", 2L));
		list.add(PotentialAssignment.forValue("float", 5.00f));
		list.add(PotentialAssignment.forValue("double", 89d));
		return list;
	}

}
