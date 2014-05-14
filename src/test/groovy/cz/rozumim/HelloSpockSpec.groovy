package cz.rozumim;

class HelloSpockSpec extends spock.lang.Specification {
	
	def "length of Spock's name"() {
		
		expect:
		name.size() == length
		
		where:
		name | length
		"Spock" | 3    // result: Running cz.rozumim.HelloSpockSpec -> There are no tests to run.
		//"Spock" | 5    // result: Running cz.rozumim.HelloSpockSpec -> Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
	}
}