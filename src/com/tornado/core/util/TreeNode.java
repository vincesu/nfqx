/*   1:    */package com.tornado.core.util;
/*   2:    */
/*   3:    */import java.util.List;
/*   4:    */import java.util.Vector;
/*   5:    */
/*   8:    */public class TreeNode
/*   9:    */{
/*  10:    */  private TreeNode parent;
/*  11: 11 */  private Vector<TreeNode> children = new Vector();
/*  12:    */  
/*  14:    */  private Object data;
/*  15:    */  
/*  17:    */  public TreeNode() {}
/*  18:    */  
/*  20:    */  public TreeNode(Object object)
/*  21:    */  {
/*  22: 22 */    this.data = object;
/*  23:    */  }
/*  24:    */  
/*  26:    */  public void add(TreeNode child, int index)
/*  27:    */  {
/*  28: 28 */    if ((index < 0) || (index == this.children.size()))
/*  29:    */    {
/*  30: 30 */      this.children.add(child);
/*  31:    */    } else {
/*  32: 32 */      if (index > this.children.size())
/*  33:    */      {
/*  34: 34 */        throw new IllegalArgumentException("Cannot add child to index " + 
/*  35: 35 */          index + ". There are only " + this.children.size() + 
/*  36: 36 */          " children.");
/*  37:    */      }
/*  38:    */      
/*  40: 40 */      this.children.add(index, child);
/*  41:    */    }
/*  42:    */    
/*  43: 43 */    child.parent = this;
/*  44:    */  }
/*  45:    */  
/*  46:    */  public void add(TreeNode child)
/*  47:    */  {
/*  48: 48 */    add(child, -1);
/*  49:    */  }
/*  50:    */  
/*  51:    */  public TreeNode remove(int index)
/*  52:    */  {
/*  53: 53 */    if ((index < 0) || (index >= this.children.size())) {
/*  54: 54 */      throw new IllegalArgumentException(
/*  55: 55 */        "Cannot remove element with index " + index + 
/*  56: 56 */        " when there are " + this.children.size() + 
/*  57: 57 */        " elements.");
/*  58:    */    }
/*  59:    */    
/*  60: 60 */    TreeNode node = (TreeNode)this.children.get(index);
/*  61: 61 */    node.parent = null;
/*  62:    */    
/*  64: 64 */    this.children.remove(index);
/*  65:    */    
/*  66: 66 */    return node;
/*  67:    */  }
/*  68:    */  
/*  69:    */  public void removeFromParent()
/*  70:    */  {
/*  71: 71 */    if (this.parent != null)
/*  72:    */    {
/*  73: 73 */      int position = index();
/*  74: 74 */      this.parent.remove(position);
/*  75: 75 */      this.parent = null;
/*  76:    */    }
/*  77:    */  }
/*  78:    */  
/*  79:    */  public TreeNode getParent()
/*  80:    */  {
/*  81: 81 */    return this.parent;
/*  82:    */  }
/*  83:    */  
/*  84:    */  public boolean isRoot()
/*  85:    */  {
/*  86: 86 */    if (this.parent == null)
/*  87:    */    {
/*  88: 88 */      return true;
/*  89:    */    }
/*  90:    */    
/*  91: 91 */    return false;
/*  92:    */  }
/*  93:    */  
/*  95:    */  public List<TreeNode> getChildren()
/*  96:    */  {
/*  97: 97 */    return this.children;
/*  98:    */  }
/*  99:    */  
/* 100:    */  public boolean hasChildren()
/* 101:    */  {
/* 102:102 */    if (this.children.size() == 0)
/* 103:    */    {
/* 104:104 */      return false;
/* 105:    */    }
/* 106:    */    
/* 108:108 */    return true;
/* 109:    */  }
/* 110:    */  
/* 112:    */  public int index()
/* 113:    */  {
/* 114:114 */    if (this.parent != null)
/* 115:    */    {
/* 116:116 */      for (int i = 0;; i++)
/* 117:    */      {
/* 118:118 */        Object node = this.parent.children.get(i);
/* 119:    */        
/* 120:120 */        if (this == node)
/* 121:    */        {
/* 122:122 */          return i;
/* 123:    */        }
/* 124:    */      }
/* 125:    */    }
/* 126:    */    
/* 128:128 */    return -1;
/* 129:    */  }
/* 130:    */  
/* 131:    */  public int depth()
/* 132:    */  {
/* 133:133 */    int depth = recurseDepth(this.parent, 0);
/* 134:134 */    return depth;
/* 135:    */  }
/* 136:    */  
/* 137:    */  private int recurseDepth(TreeNode node, int depth)
/* 138:    */  {
/* 139:139 */    if (node == null)
/* 140:    */    {
/* 141:141 */      return depth;
/* 142:    */    }
/* 143:    */    
/* 144:144 */    return recurseDepth(node.parent, depth + 1);
/* 145:    */  }
/* 146:    */  
/* 148:    */  public void setData(Object object)
/* 149:    */  {
/* 150:150 */    this.data = object;
/* 151:    */  }
/* 152:    */  
/* 153:    */  public Object getData()
/* 154:    */  {
/* 155:155 */    return this.data;
/* 156:    */  }
/* 157:    */  
/* 163:    */  public TreeNode findNode(Object key)
/* 164:    */  {
/* 165:165 */    if (this.data != null)
/* 166:    */    {
/* 167:167 */      if (this.data.equals(key)) {
/* 168:168 */        return this;
/* 169:    */      }
/* 170:    */    }
/* 171:171 */    TreeNode result = null;
/* 172:172 */    for (TreeNode tn : this.children)
/* 173:    */    {
/* 174:174 */      result = tn.findNode(key);
/* 175:175 */      if (result != null)
/* 176:176 */        return result;
/* 177:    */    }
/* 178:178 */    return null;
/* 179:    */  }
/* 180:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.util.TreeNode
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */