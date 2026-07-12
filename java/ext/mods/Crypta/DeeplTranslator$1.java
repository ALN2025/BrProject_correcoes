// Bytecode for: ext.mods.Crypta.DeeplTranslator$1
// File: ext\mods\Crypta\DeeplTranslator$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/DeeplTranslator$1.class
  Last modified 9 de jul de 2026; size 2070 bytes
  MD5 checksum 6fba5f653e3f359764f3539faac64fe7
  Compiled from "DeeplTranslator.java"
class ext.mods.Crypta.DeeplTranslator$1 implements org.jsoup.select.NodeVisitor
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/Crypta/DeeplTranslator$1
  super_class: #18                        // java/lang/Object
  interfaces: 1, fields: 2, methods: 3, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/Crypta/DeeplTranslator$1.val$self:Lext/mods/Crypta/DeeplTranslator;
    #2 = Class              #4            // ext/mods/Crypta/DeeplTranslator$1
    #3 = NameAndType        #5:#6         // val$self:Lext/mods/Crypta/DeeplTranslator;
    #4 = Utf8               ext/mods/Crypta/DeeplTranslator$1
    #5 = Utf8               val$self
    #6 = Utf8               Lext/mods/Crypta/DeeplTranslator;
    #7 = Fieldref           #2.#8         // ext/mods/Crypta/DeeplTranslator$1.val$textNodes:Ljava/util/List;
    #8 = NameAndType        #9:#10        // val$textNodes:Ljava/util/List;
    #9 = Utf8               val$textNodes
   #10 = Utf8               Ljava/util/List;
   #11 = Methodref          #12.#13       // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #12 = Class              #14           // java/util/Objects
   #13 = NameAndType        #15:#16       // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #14 = Utf8               java/util/Objects
   #15 = Utf8               requireNonNull
   #16 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #17 = Methodref          #18.#19       // java/lang/Object."<init>":()V
   #18 = Class              #20           // java/lang/Object
   #19 = NameAndType        #21:#22       // "<init>":()V
   #20 = Utf8               java/lang/Object
   #21 = Utf8               <init>
   #22 = Utf8               ()V
   #23 = Class              #24           // org/jsoup/nodes/TextNode
   #24 = Utf8               org/jsoup/nodes/TextNode
   #25 = Methodref          #23.#26       // org/jsoup/nodes/TextNode.text:()Ljava/lang/String;
   #26 = NameAndType        #27:#28       // text:()Ljava/lang/String;
   #27 = Utf8               text
   #28 = Utf8               ()Ljava/lang/String;
   #29 = Methodref          #30.#31       // java/lang/String.trim:()Ljava/lang/String;
   #30 = Class              #32           // java/lang/String
   #31 = NameAndType        #33:#28       // trim:()Ljava/lang/String;
   #32 = Utf8               java/lang/String
   #33 = Utf8               trim
   #34 = Methodref          #30.#35       // java/lang/String.isBlank:()Z
   #35 = NameAndType        #36:#37       // isBlank:()Z
   #36 = Utf8               isBlank
   #37 = Utf8               ()Z
   #38 = String             #39           //  
   #39 = Utf8                
   #40 = String             #41           //
   #41 = Utf8
   #42 = Methodref          #30.#43       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #43 = NameAndType        #44:#45       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #44 = Utf8               replace
   #45 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #46 = Methodref          #47.#48       // ext/mods/Crypta/DeeplTranslator.containsClosingTags:(Ljava/lang/String;)Z
   #47 = Class              #49           // ext/mods/Crypta/DeeplTranslator
   #48 = NameAndType        #50:#51       // containsClosingTags:(Ljava/lang/String;)Z
   #49 = Utf8               ext/mods/Crypta/DeeplTranslator
   #50 = Utf8               containsClosingTags
   #51 = Utf8               (Ljava/lang/String;)Z
   #52 = Methodref          #47.#53       // ext/mods/Crypta/DeeplTranslator.isOnlyPlaceholder:(Ljava/lang/String;)Z
   #53 = NameAndType        #54:#51       // isOnlyPlaceholder:(Ljava/lang/String;)Z
   #54 = Utf8               isOnlyPlaceholder
   #55 = Methodref          #23.#56       // org/jsoup/nodes/TextNode.parent:()Lorg/jsoup/nodes/Node;
   #56 = NameAndType        #57:#58       // parent:()Lorg/jsoup/nodes/Node;
   #57 = Utf8               parent
   #58 = Utf8               ()Lorg/jsoup/nodes/Node;
   #59 = Class              #60           // org/jsoup/nodes/Element
   #60 = Utf8               org/jsoup/nodes/Element
   #61 = Methodref          #59.#62       // org/jsoup/nodes/Element.tagName:()Ljava/lang/String;
   #62 = NameAndType        #63:#28       // tagName:()Ljava/lang/String;
   #63 = Utf8               tagName
   #64 = Methodref          #30.#65       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #65 = NameAndType        #66:#28       // toLowerCase:()Ljava/lang/String;
   #66 = Utf8               toLowerCase
   #67 = String             #68           // button
   #68 = Utf8               button
   #69 = Methodref          #30.#70       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #70 = NameAndType        #71:#72       // equals:(Ljava/lang/Object;)Z
   #71 = Utf8               equals
   #72 = Utf8               (Ljava/lang/Object;)Z
   #73 = String             #74           // script
   #74 = Utf8               script
   #75 = String             #76           // style
   #76 = Utf8               style
   #77 = InterfaceMethodref #78.#79       // java/util/List.add:(Ljava/lang/Object;)Z
   #78 = Class              #80           // java/util/List
   #79 = NameAndType        #81:#72       // add:(Ljava/lang/Object;)Z
   #80 = Utf8               java/util/List
   #81 = Utf8               add
   #82 = Class              #83           // org/jsoup/select/NodeVisitor
   #83 = Utf8               org/jsoup/select/NodeVisitor
   #84 = Utf8               (Lext/mods/Crypta/DeeplTranslator;Lext/mods/Crypta/DeeplTranslator;Ljava/util/List;)V
   #85 = Utf8               Code
   #86 = Utf8               LineNumberTable
   #87 = Utf8               LocalVariableTable
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/Crypta/DeeplTranslator$1;
   #90 = Utf8               this$0
   #91 = Utf8               MethodParameters
   #92 = Utf8               Signature
   #93 = Utf8               head
   #94 = Utf8               (Lorg/jsoup/nodes/Node;I)V
   #95 = Utf8               parentTag
   #96 = Utf8               Ljava/lang/String;
   #97 = Utf8               Lorg/jsoup/nodes/Node;
   #98 = Utf8               textNode
   #99 = Utf8               Lorg/jsoup/nodes/TextNode;
  #100 = Utf8               node
  #101 = Utf8               depth
  #102 = Utf8               I
  #103 = Utf8               StackMapTable
  #104 = Utf8               tail
  #105 = Utf8               SourceFile
  #106 = Utf8               DeeplTranslator.java
  #107 = Utf8               EnclosingMethod
  #108 = NameAndType        #109:#110     // extractTextNodesForTranslation:(Lorg/jsoup/nodes/Document;)Ljava/util/List;
  #109 = Utf8               extractTextNodesForTranslation
  #110 = Utf8               (Lorg/jsoup/nodes/Document;)Ljava/util/List;
  #111 = Utf8               NestHost
  #112 = Utf8               InnerClasses
{
  final ext.mods.Crypta.DeeplTranslator val$self;
    descriptor: Lext/mods/Crypta/DeeplTranslator;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.util.List val$textNodes;
    descriptor: Ljava/util/List;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.Crypta.DeeplTranslator$1();
    descriptor: (Lext/mods/Crypta/DeeplTranslator;Lext/mods/Crypta/DeeplTranslator;Ljava/util/List;)V
    flags: (0x0000)
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$self:Lext/mods/Crypta/DeeplTranslator;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$textNodes:Ljava/util/List;
        10: aload_1
        11: dup
        12: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: pop
        17: aload_0
        18: invokespecial #17                 // Method java/lang/Object."<init>":()V
        21: return
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/Crypta/DeeplTranslator$1;
            0      22     1 this$0   Lext/mods/Crypta/DeeplTranslator;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic
    Signature: #22                          // ()V

  public void head(org.jsoup.nodes.Node, int);
    descriptor: (Lorg/jsoup/nodes/Node;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_1
         1: instanceof    #23                 // class org/jsoup/nodes/TextNode
         4: ifeq          135
         7: aload_1
         8: checkcast     #23                 // class org/jsoup/nodes/TextNode
        11: astore_3
        12: aload_3
        13: invokevirtual #25                 // Method org/jsoup/nodes/TextNode.text:()Ljava/lang/String;
        16: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
        19: astore        4
        21: aload         4
        23: invokevirtual #34                 // Method java/lang/String.isBlank:()Z
        26: ifne          135
        29: aload         4
        31: ldc           #38                 // String  
        33: ldc           #40                 // String
        35: invokevirtual #42                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        38: invokevirtual #34                 // Method java/lang/String.isBlank:()Z
        41: ifne          135
        44: aload_0
        45: getfield      #1                  // Field val$self:Lext/mods/Crypta/DeeplTranslator;
        48: aload         4
        50: invokevirtual #46                 // Method ext/mods/Crypta/DeeplTranslator.containsClosingTags:(Ljava/lang/String;)Z
        53: ifeq          57
        56: return
        57: aload_0
        58: getfield      #1                  // Field val$self:Lext/mods/Crypta/DeeplTranslator;
        61: aload         4
        63: invokevirtual #52                 // Method ext/mods/Crypta/DeeplTranslator.isOnlyPlaceholder:(Ljava/lang/String;)Z
        66: ifeq          70
        69: return
        70: aload_3
        71: invokevirtual #55                 // Method org/jsoup/nodes/TextNode.parent:()Lorg/jsoup/nodes/Node;
        74: astore        5
        76: aload         5
        78: ifnull        135
        81: aload         5
        83: checkcast     #59                 // class org/jsoup/nodes/Element
        86: invokevirtual #61                 // Method org/jsoup/nodes/Element.tagName:()Ljava/lang/String;
        89: invokevirtual #64                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        92: astore        6
        94: aload         6
        96: ldc           #67                 // String button
        98: invokevirtual #69                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       101: ifne          135
       104: aload         6
       106: ldc           #73                 // String script
       108: invokevirtual #69                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       111: ifne          135
       114: aload         6
       116: ldc           #75                 // String style
       118: invokevirtual #69                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       121: ifne          135
       124: aload_0
       125: getfield      #7                  // Field val$textNodes:Ljava/util/List;
       128: aload_3
       129: invokeinterface #77,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       134: pop
       135: return
      LineNumberTable:
        line 311: 0
        line 312: 7
        line 313: 12
        line 314: 21
        line 315: 44
        line 316: 56
        line 319: 57
        line 320: 69
        line 323: 70
        line 324: 76
        line 325: 81
        line 326: 94
        line 327: 124
        line 332: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           94      41     6 parentTag   Ljava/lang/String;
           76      59     5 parent   Lorg/jsoup/nodes/Node;
           12     123     3 textNode   Lorg/jsoup/nodes/TextNode;
           21     114     4  text   Ljava/lang/String;
            0     136     0  this   Lext/mods/Crypta/DeeplTranslator$1;
            0     136     1  node   Lorg/jsoup/nodes/Node;
            0     136     2 depth   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ class org/jsoup/nodes/TextNode, class java/lang/String ]
        frame_type = 12 /* same */
        frame_type = 249 /* chop */
          offset_delta = 64

  public void tail(org.jsoup.nodes.Node, int);
    descriptor: (Lorg/jsoup/nodes/Node;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 336: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/Crypta/DeeplTranslator$1;
            0       1     1  node   Lorg/jsoup/nodes/Node;
            0       1     2 depth   I
}
SourceFile: "DeeplTranslator.java"
EnclosingMethod: #47.#108               // ext.mods.Crypta.DeeplTranslator.extractTextNodesForTranslation
NestHost: class ext/mods/Crypta/DeeplTranslator
InnerClasses:
  #2;                                     // class ext/mods/Crypta/DeeplTranslator$1
