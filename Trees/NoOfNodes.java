import java.util.Scanner;

public class NoOfNodes {
	
	static class Pair<T>{
		T first;
		T second;
		 Pair(T first , T second) {
			this.first = first;
			this.second = second;
		}
	}
	
	public static TreeNode<Integer> firstSecondLargest(TreeNode<Integer> root){
		return helper(root).second;
	}
	
	public static Pair<TreeNode<Integer>> helper(TreeNode<Integer> root){
		Pair<TreeNode<Integer>> output;
		if(root == null) {
			output = new Pair<TreeNode<Integer>>(null, null);
			return output;
		}
		output = new Pair<TreeNode<Integer>>(root, null);
		for(TreeNode<Integer> child : root.children) {
			Pair<TreeNode<Integer>> childPair = helper(child);
			if(childPair.first.data > output.first.data) {
				if(childPair.second == null || childPair.second.data < output.first.data) {
				output.first = childPair.first;
				output.first = childPair.first;
			}else {
				output.first = childPair.first;
				output.second = childPair.second;
			}
		}else if(output.first.data != childPair.first.data && (output.second == null || childPair.first.data > output.second.data)) {
				output.second = childPair.first;
			}
		}
		return output;
	}
	
	public static void printAtK(TreeNode<Integer> root , int k) {
		if(k < 0) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0 ; i <root.children.size() ; i++) {
			printAtK(root.children.get(i), k-1);
		}
	}
	
	public static int max(TreeNode<Integer> root) {
		int maxsum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++) {
			maxsum += root.children.get(i).data;
		}
		return maxsum;
	}
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1 == null && root2 == null) {
        	return true;
        }
        if(root1 == null || root2 == null) {
        	return false;
        }
        if(root1.children.size() != root2.children.size()) {
        	return false;
        }
        for(int i = 0 ; i < root1.children.size() ;i++) {
        	if(!checkIdentical(root1.children.get(i), root2.children.get(i))) {
        		return false;
        	}
        }   
		return true;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		int rootsum = max(root);
		TreeNode<Integer> max = root;
		TreeNode<Integer> child;
		int childsum;
		for(int i = 0 ; i < root.children.size() ;i++) {
			child = maxSumNode(root.children.get(i));
			childsum = max(root.children.get(i));
			if(rootsum < childsum) {
				max = child;
			}
		}
		return max;
	}
	
	public static TreeNode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of childern for" + n);
		int childCount = s.nextInt();
		for(int i = 0 ; i < childCount ; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int startsize = 0;
	    for(int i = 0 ; i < root.children.size() ; i++) {
	    	//int size = root.children.size();
	    	int finalSize = height(root.children.get(i));
	    	if(startsize < finalSize) {
	    		startsize = finalSize;
	    	}
	    }
	    return startsize+1;
	}
	
	public static TreeNode<Integer> findNextLargestNode(TreeNode<Integer> root , int n){
		if(root == null) {
			return null;
		}
		int rootdata = Integer.MIN_VALUE;
		TreeNode<Integer> ansNode = null;
		//TreeNode<Integer> temp = null;
		if(root.data > n) {
			rootdata = root.data;
			ansNode = root;
		}
		for(int i = 0 ; i < root.children.size() ; i++) {
			TreeNode<Integer> childNode = findNextLargestNode(root.children.get(i), n);
			if(childNode != null) {
				int childdata = childNode.data;
				if(childdata>n &&(childdata < rootdata || rootdata == Integer.MIN_VALUE)) {
					ansNode = childNode;
					rootdata = childdata;
				}
			}
		}
		return ansNode;
	}
	
    public static int SumNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int sum = 0;
		for(int i = 0 ; i < root.children.size() ; i++) {
		       sum+=SumNodes(root.children.get(i));
		}
		return sum+root.data;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of "+ frontNode.data);
				int numChildren = s.nextInt();
				for(int i = 0 ; i < numChildren ; i++) {
					System.out.println("Enter "+ (i+1) + "th child of "+ frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
					
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here 
				return null;
			}
		}
		return root;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeInputLevelWise();
		root = firstSecondLargest(root);
		System.out.println(root.data);
		//System.out.println(height(root));
		//root = maxSumNode(root);
		//System.out.println(maxSumNode(root).data);

	}

}
