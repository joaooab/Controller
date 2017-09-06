package br.com.zgsolucoes

class ControllerTest extends GroovyTestCase {
	
	Portao portao = new Portao();
	
	void testExecute() {
		Controller controller = new Controller(portao)
		assert ("001234321000" == controller.execute("..P...O....."))
	}
	
	void testExecute2() {
		Controller controller = new Controller(portao)
		assert ("012345" == controller.execute(".P...."))
	}
	
	void testExecute3() {
		Controller controller = new Controller(portao)
		assert ("000122222345" == controller.execute("...P.P...P.."))
	}
	
	void testExecute4() {
		Controller controller = new Controller(portao)
		assert ("123210" == controller.execute("P..O.."))
	}
	
	void testExecute5() {
		Controller controller = new Controller(portao)
		assert ("123333343210" == controller.execute("P..P...PO..."))
	}
	
	void testExecute6() {
		Controller controller = new Controller(portao)
		assert ("123432344444555" == controller.execute("P...O.O.P...P.."))
	}
}
