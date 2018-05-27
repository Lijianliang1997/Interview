package trie;

/**
 * Created by qq940 on 2018/4/16.
 */
public class TrieImpl {
    private class Node {
        Node[] childs = new Node[26];
        boolean isLeaf;
    }

    private Node root = new Node();

    public TrieImpl () {

    }

    public void insert (String word) {
        int idx = word.charAt(0) - 'a';
        insert(word, root);
    }

    private void insert (String word, Node node) {
        int idx = word.charAt(0) - 'a';
        if (node.childs[idx] == null) {
            node.childs[idx] = new Node();
        }
        if (word.length() == 1) {
            node.childs[idx].isLeaf = true;
        } else {
            insert(word.substring(1), node.childs[idx]);
        }
    }

    public boolean search (String word, Node node) {
        if (node == null) {

        }
        return false;
    }
}
