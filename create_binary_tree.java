    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Function to insert a new node in the BST
static Node insert(Node root, int data) {
    if (root == null) {
        return new Node(data);
    }
    if (data < root.data) {
        root.left = insert(root.left, data);
        System.out.println("Inserted " + data + " to the left of " + root.data);
    } else if (data > root.data) {
        root.right = insert(root.right, data);
        System.out.println("Inserted " + data + " to the right of " + root.data);
    }
    return root;
}

public static void main(String[] args) {
    Node root = null;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] values = new int[n];
    for (int i = 0; i < n; i++) {
        values[i] = sc.nextInt();
    }
    for (int value : values) {
        root = insert(root, value);
    }
    System.out.println("BST constructed successfully.");
}
