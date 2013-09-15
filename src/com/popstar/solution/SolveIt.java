package com.popstar.solution;

import java.util.ArrayList;

/**
 * 
 * @author Hercules
 * 
 *         二维数组中的数字与颜色的显示： 1：绿色 2：紫色 3：红色 4：黄色 5：蓝色 空格中没有了就用数字 8 代替 8=NIL
 * 
 * 
 */
public class SolveIt {
	// 接受10x10的二维数组，返回一个ArrayList的结果作为最终的答案
	public static ArrayList<String> solve(int[][] q) {
		ArrayList<String> answer = new ArrayList<String>();
		// 把所有的不能继续分割的Node储存起来，最后作比较，取出totalScore最大的那个，顺藤摸瓜即可
		ArrayList<Node> leafNodes = new ArrayList<Node>();

		Node root = new Node();
		root.setScore(0);
		root.setTotalScore(0);
		root.setStep("");
		root.setParent(null);
		root.setAfterStep(copyMatrix(q));

		return answer;
	}

	private void deal(Node p, ArrayList<Node> leafNodes) {
		while (!isLeafNode(p)) {
			
			
			
			
		}
	}

	// 判断这个节点是不是叶子节点 判断的是这个Node的afterStep属性
	private boolean isLeafNode(Node node) {
		boolean flag = false;

		return flag;
	}

	private static int[][] copyMatrix(int[][] q) {
		int[][] temp = new int[10][10];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = q[i][j];
			}
		}
		return temp;
	}
}

class Node {
	private Node parent;
	private ArrayList<Node> children;
	private String step;
	private int[][] afterStep;
	private int score;
	private int totalScore;

	public int[][] getAfterStep() {
		return afterStep;
	}

	public void setAfterStep(int[][] afterStep) {
		this.afterStep = afterStep;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public void addChild(Node child) {
		this.children.add(child);
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

}
