package com.enrol

class Course {
	String department 

	String title // A variable showing the title of the course 

	String leader // A variable showing the leader ofthe course 

	String code // A variable showing the course code 

	Date startDate //This line of command will state the start date of the course 

	Date endDate //This line of command will show the end date of the course

	String description // A character formed variable describing the course

	int numberOfStudents //An integer variable showing the number of students on the course

	Double tuitionFees 

        String studyMode


    static constraints = {
	title blank:false, nullable:false
	department blank:false, nullable:false
	leader blank:false, nullable:false
	code blank:false, nullable:false 
	numberOfStudents blank:false, nullable:false, min:20, max:60
	startDate blank:false, nullable:false 
	endDate blank:false, nullable:false 
	studyMode blank:false, nullable:false, size:1..20
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	tuitionFees blank:false, nullable:false, scale:2
    }
}
