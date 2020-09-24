import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1991 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Tree t = new Tree();
		
		char data[];
		for(int i=0;i<n;i++) {
			data = br.readLine().replaceAll(" ", "").toCharArray();
			t.add(data[0], data[1], data[2]);
		}
		
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		
	}

}
class Node {
	char data;
	Node left_node, right_node;
	public Node(char data) {
		this.data = data;
	}
}

class Tree{
	Node root;
	
	public void add(char data, char left_data, char right_data) {
		if(root == null) {
			if(data!='.') {
				root = new Node(data);
			}
			if(left_data!='.') {
				root.left_node = new Node(left_data);
			}
			if(right_data!='.') {
				root.right_node = new Node(right_data);
			}
		}else {
			search(root, data, left_data, right_data);
		}
	}
	
	public void search(Node root, char data, char left_data, char right_data) {
		if(root==null) {
			return;
		}else if(root.data == data) {
			if(left_data!='.') {
				root.left_node = new Node(left_data);
			}
			if(right_data!='.') {
				root.right_node = new Node(right_data);
			}
		}else {
			search(root.left_node,data,left_data,right_data);
			search(root.right_node,data,left_data,right_data);
		}
	}
	
	public void preorder(Node root) {
		System.out.print(root.data);
		if(root.left_node!=null) {
			preorder(root.left_node);
		}
		if(root.right_node!=null) {
			preorder(root.right_node);
		}
	}
	
	public void inorder(Node root) {
		if(root.left_node!=null) {
			inorder(root.left_node);
		}
		System.out.print(root.data);
		if(root.right_node!=null) {
			inorder(root.right_node);
		}
	}
	
	public void postorder(Node root) {
		if(root.left_node!=null) {
			postorder(root.left_node);
		}
		if(root.right_node!=null) {
			postorder(root.right_node);
		}
		System.out.print(root.data);
	}
}
