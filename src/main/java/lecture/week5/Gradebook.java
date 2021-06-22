/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package lecture.week5;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
	/*
	A grade book is a collection of student assignment scores + aggregated metrics of student performance.
	 */

	List<Assignment> assignments;

	public Gradebook() {
		assignments = new ArrayList<>();
	}

	public void addAssignments(Assignment newAssignments) {
		// add new assignment to assignments
		assignments.add(newAssignments);
	}

	public void addStudent(Student newStudent) {

		// for each assignment
			// add the new student to the assignment
			// set student grade to 0

	}

}
