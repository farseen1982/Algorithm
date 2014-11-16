import static org.junit.Assert.fail;

import org.junit.Test;

import datastructure.TreeNode;


public class AlgoUtilTest {

	@Test
	public void testCovert2int() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintArrayStringArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintArrayIntArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintArrayIntArrayIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuildTreeNode() {
		String[] array = new String[6];
		array[0] = "4";
		array[1] = "15";
		array[2] = "5";
		array[3] = "6";
		array[4] = "9";
		array[5] = "7";
		TreeNode node = AlgoUtil.buildTreeNode(array);
		System.out.println(node.key);
		
	}

}
