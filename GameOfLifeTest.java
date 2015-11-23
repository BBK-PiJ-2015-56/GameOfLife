import org.junit.*;
import static org.junit.Assert.*;

public class GameOfLifeTest{
	@Test
	public void testsWhenNeighbourCountBelow2(){
		for(int i=0; i<2; i++){
			int neighbourCount = i;
			State output = GameOfLife.getNextState(State.LIVE , i);
			State expected = State.DEAD;
			assertEquals(expected , output);
		}
		for(int i=0; i<2; i++){
			int neighbourCount = i;
			State output = GameOfLife.getNextState(State.DEAD , i);
			State expected = State.DEAD;
			assertEquals(expected , output);
		}
	}
	
	
	@Test
	public void testsWhenNeighBourMoreThan3(){
		for(int i=4; i<9; i++){
			int neighbourCount = i;
			State output = GameOfLife.getNextState(State.LIVE , i);
			State expected = State.DEAD;
			assertEquals(expected , output);
		}
		for(int i=4; i<9; i++){
			int neighbourCount = i;
			State output = GameOfLife.getNextState(State.DEAD , i);
			State expected = State.DEAD;
			assertEquals(expected , output);
		}
	}
	@Test
	public void testsWhen2Neighbours(){
		State output = GameOfLife.getNextState(State.LIVE , 2);
		State expected = State.LIVE;
		assertEquals(expected , output);
		
		output = GameOfLife.getNextState(State.DEAD , 2);
		expected = State.DEAD;
		assertEquals(expected , output);
	}
	
	@Test
	public void testsWhen3Neighbours(){
		State output = GameOfLife.getNextState(State.LIVE , 3);
		State expected = State.LIVE;
		assertEquals(expected , output);
		
		output = GameOfLife.getNextState(State.DEAD , 3);
		expected = State.LIVE;
		assertEquals(expected , output);
	}
}











