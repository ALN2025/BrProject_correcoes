// Bytecode for: ext.mods.gameserver.data.DocumentItem
// File: ext\mods\gameserver\data\DocumentItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DocumentItem.class
  Last modified 9 de jul de 2026; size 6484 bytes
  MD5 checksum d8c393c66ee7f7fe0592bcdd8319f667
  Compiled from "DocumentItem.java"
public final class ext.mods.gameserver.data.DocumentItem extends ext.mods.gameserver.data.DocumentBase
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/data/DocumentItem
  super_class: #2                         // ext/mods/gameserver/data/DocumentBase
  interfaces: 0, fields: 2, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/data/DocumentBase."<init>":(Ljava/io/File;)V
    #2 = Class              #4            // ext/mods/gameserver/data/DocumentBase
    #3 = NameAndType        #5:#6         // "<init>":(Ljava/io/File;)V
    #4 = Utf8               ext/mods/gameserver/data/DocumentBase
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/io/File;)V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#10        // java/util/ArrayList."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/data/DocumentItem._itemsInFile:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/data/DocumentItem
   #14 = NameAndType        #16:#17       // _itemsInFile:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/data/DocumentItem
   #16 = Utf8               _itemsInFile
   #17 = Utf8               Ljava/util/List;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/data/DocumentItem._currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
   #19 = NameAndType        #20:#21       // _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
   #20 = Utf8               _currentItem
   #21 = Utf8               Lext/mods/gameserver/data/DocumentItem$NewItem;
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
   #23 = Class              #25           // ext/mods/gameserver/data/DocumentItem$NewItem
   #24 = NameAndType        #26:#27       // set:Lext/mods/commons/data/StatSet;
   #25 = Utf8               ext/mods/gameserver/data/DocumentItem$NewItem
   #26 = Utf8               set
   #27 = Utf8               Lext/mods/commons/data/StatSet;
   #28 = Fieldref           #13.#29       // ext/mods/gameserver/data/DocumentItem._tables:Ljava/util/Map;
   #29 = NameAndType        #30:#31       // _tables:Ljava/util/Map;
   #30 = Utf8               _tables
   #31 = Utf8               Ljava/util/Map;
   #32 = InterfaceMethodref #33.#34       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #33 = Class              #35           // java/util/Map
   #34 = NameAndType        #36:#37       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #35 = Utf8               java/util/Map
   #36 = Utf8               get
   #37 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #38 = Class              #39           // "[Ljava/lang/String;"
   #39 = Utf8               [Ljava/lang/String;
   #40 = Fieldref           #23.#41       // ext/mods/gameserver/data/DocumentItem$NewItem.currentLevel:I
   #41 = NameAndType        #42:#43       // currentLevel:I
   #42 = Utf8               currentLevel
   #43 = Utf8               I
   #44 = InterfaceMethodref #45.#46       // org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
   #45 = Class              #47           // org/w3c/dom/Document
   #46 = NameAndType        #48:#49       // getFirstChild:()Lorg/w3c/dom/Node;
   #47 = Utf8               org/w3c/dom/Document
   #48 = Utf8               getFirstChild
   #49 = Utf8               ()Lorg/w3c/dom/Node;
   #50 = String             #51           // list
   #51 = Utf8               list
   #52 = InterfaceMethodref #53.#54       // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #53 = Class              #55           // org/w3c/dom/Node
   #54 = NameAndType        #56:#57       // getNodeName:()Ljava/lang/String;
   #55 = Utf8               org/w3c/dom/Node
   #56 = Utf8               getNodeName
   #57 = Utf8               ()Ljava/lang/String;
   #58 = Methodref          #59.#60       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #59 = Class              #61           // java/lang/String
   #60 = NameAndType        #62:#63       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #61 = Utf8               java/lang/String
   #62 = Utf8               equalsIgnoreCase
   #63 = Utf8               (Ljava/lang/String;)Z
   #64 = InterfaceMethodref #53.#46       // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
   #65 = String             #66           // item
   #66 = Utf8               item
   #67 = Methodref          #23.#68       // ext/mods/gameserver/data/DocumentItem$NewItem."<init>":(Lext/mods/gameserver/data/DocumentItem;)V
   #68 = NameAndType        #5:#69        // "<init>":(Lext/mods/gameserver/data/DocumentItem;)V
   #69 = Utf8               (Lext/mods/gameserver/data/DocumentItem;)V
   #70 = Methodref          #13.#71       // ext/mods/gameserver/data/DocumentItem.parseItem:(Lorg/w3c/dom/Node;)V
   #71 = NameAndType        #72:#73       // parseItem:(Lorg/w3c/dom/Node;)V
   #72 = Utf8               parseItem
   #73 = Utf8               (Lorg/w3c/dom/Node;)V
   #74 = Fieldref           #23.#75       // ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
   #75 = NameAndType        #66:#76       // item:Lext/mods/gameserver/model/item/kind/Item;
   #76 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #77 = InterfaceMethodref #78.#79       // java/util/List.add:(Ljava/lang/Object;)Z
   #78 = Class              #80           // java/util/List
   #79 = NameAndType        #81:#82       // add:(Ljava/lang/Object;)Z
   #80 = Utf8               java/util/List
   #81 = Utf8               add
   #82 = Utf8               (Ljava/lang/Object;)Z
   #83 = Methodref          #13.#84       // ext/mods/gameserver/data/DocumentItem.resetTable:()V
   #84 = NameAndType        #85:#11       // resetTable:()V
   #85 = Utf8               resetTable
   #86 = Class              #87           // java/lang/Exception
   #87 = Utf8               java/lang/Exception
   #88 = Fieldref           #13.#89       // ext/mods/gameserver/data/DocumentItem.LOGGER:Lext/mods/commons/logging/CLogger;
   #89 = NameAndType        #90:#91       // LOGGER:Lext/mods/commons/logging/CLogger;
   #90 = Utf8               LOGGER
   #91 = Utf8               Lext/mods/commons/logging/CLogger;
   #92 = String             #93           // Cannot create item {}.
   #93 = Utf8               Cannot create item {}.
   #94 = Class              #95           // java/lang/Object
   #95 = Utf8               java/lang/Object
   #96 = Fieldref           #23.#97       // ext/mods/gameserver/data/DocumentItem$NewItem.id:I
   #97 = NameAndType        #98:#43       // id:I
   #98 = Utf8               id
   #99 = Methodref          #100.#101     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #100 = Class              #102          // java/lang/Integer
  #101 = NameAndType        #103:#104     // valueOf:(I)Ljava/lang/Integer;
  #102 = Utf8               java/lang/Integer
  #103 = Utf8               valueOf
  #104 = Utf8               (I)Ljava/lang/Integer;
  #105 = Methodref          #106.#107     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #106 = Class              #108          // ext/mods/commons/logging/CLogger
  #107 = NameAndType        #109:#110     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #108 = Utf8               ext/mods/commons/logging/CLogger
  #109 = Utf8               error
  #110 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #111 = InterfaceMethodref #53.#112      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #112 = NameAndType        #113:#49      // getNextSibling:()Lorg/w3c/dom/Node;
  #113 = Utf8               getNextSibling
  #114 = InterfaceMethodref #53.#115      // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #115 = NameAndType        #116:#117     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #116 = Utf8               getAttributes
  #117 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #118 = String             #98           // id
  #119 = InterfaceMethodref #120.#121     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #120 = Class              #122          // org/w3c/dom/NamedNodeMap
  #121 = NameAndType        #123:#124     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #122 = Utf8               org/w3c/dom/NamedNodeMap
  #123 = Utf8               getNamedItem
  #124 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #125 = InterfaceMethodref #53.#126      // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #126 = NameAndType        #127:#57      // getNodeValue:()Ljava/lang/String;
  #127 = Utf8               getNodeValue
  #128 = Methodref          #100.#129     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #129 = NameAndType        #130:#131     // parseInt:(Ljava/lang/String;)I
  #130 = Utf8               parseInt
  #131 = Utf8               (Ljava/lang/String;)I
  #132 = String             #133          // type
  #133 = Utf8               type
  #134 = String             #135          // name
  #135 = Utf8               name
  #136 = Fieldref           #23.#137      // ext/mods/gameserver/data/DocumentItem$NewItem.name:Ljava/lang/String;
  #137 = NameAndType        #135:#138     // name:Ljava/lang/String;
  #138 = Utf8               Ljava/lang/String;
  #139 = Fieldref           #23.#140      // ext/mods/gameserver/data/DocumentItem$NewItem.type:Ljava/lang/String;
  #140 = NameAndType        #133:#138     // type:Ljava/lang/String;
  #141 = Class              #142          // ext/mods/commons/data/StatSet
  #142 = Utf8               ext/mods/commons/data/StatSet
  #143 = Methodref          #141.#10      // ext/mods/commons/data/StatSet."<init>":()V
  #144 = String             #145          // item_id
  #145 = Utf8               item_id
  #146 = Methodref          #141.#147     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #147 = NameAndType        #26:#148      // set:(Ljava/lang/String;I)V
  #148 = Utf8               (Ljava/lang/String;I)V
  #149 = Methodref          #141.#150     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #150 = NameAndType        #26:#151      // set:(Ljava/lang/String;Ljava/lang/String;)V
  #151 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #152 = String             #153          // table
  #153 = Utf8               table
  #154 = Class              #155          // java/lang/IllegalStateException
  #155 = Utf8               java/lang/IllegalStateException
  #156 = InvokeDynamic      #0:#157       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #157 = NameAndType        #158:#159     // makeConcatWithConstants:(I)Ljava/lang/String;
  #158 = Utf8               makeConcatWithConstants
  #159 = Utf8               (I)Ljava/lang/String;
  #160 = Methodref          #154.#161     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #161 = NameAndType        #5:#162       // "<init>":(Ljava/lang/String;)V
  #162 = Utf8               (Ljava/lang/String;)V
  #163 = Methodref          #13.#164      // ext/mods/gameserver/data/DocumentItem.parseTable:(Lorg/w3c/dom/Node;)V
  #164 = NameAndType        #165:#73      // parseTable:(Lorg/w3c/dom/Node;)V
  #165 = Utf8               parseTable
  #166 = String             #26           // set
  #167 = InvokeDynamic      #1:#157       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #168 = Methodref          #13.#169      // ext/mods/gameserver/data/DocumentItem.parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #169 = NameAndType        #170:#171     // parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #170 = Utf8               parseBeanSet
  #171 = Utf8               (Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #172 = String             #173          // for
  #173 = Utf8               for
  #174 = Methodref          #13.#175      // ext/mods/gameserver/data/DocumentItem.makeItem:()V
  #175 = NameAndType        #176:#11      // makeItem:()V
  #176 = Utf8               makeItem
  #177 = Methodref          #13.#178      // ext/mods/gameserver/data/DocumentItem.parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #178 = NameAndType        #179:#180     // parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #179 = Utf8               parseTemplate
  #180 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #181 = String             #182          // cond
  #182 = Utf8               cond
  #183 = Methodref          #13.#184      // ext/mods/gameserver/data/DocumentItem.parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #184 = NameAndType        #185:#186     // parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #185 = Utf8               parseCondition
  #186 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #187 = String             #188          // msg
  #188 = Utf8               msg
  #189 = String             #190          // msgId
  #190 = Utf8               msgId
  #191 = Methodref          #192.#193     // ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
  #192 = Class              #194          // ext/mods/gameserver/skills/conditions/Condition
  #193 = NameAndType        #195:#162     // setMessage:(Ljava/lang/String;)V
  #194 = Utf8               ext/mods/gameserver/skills/conditions/Condition
  #195 = Utf8               setMessage
  #196 = Methodref          #13.#197      // ext/mods/gameserver/data/DocumentItem.getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #197 = NameAndType        #198:#199     // getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #198 = Utf8               getValue
  #199 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #200 = Methodref          #100.#201     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #201 = NameAndType        #202:#203     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #202 = Utf8               decode
  #203 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #204 = Methodref          #100.#205     // java/lang/Integer.intValue:()I
  #205 = NameAndType        #206:#207     // intValue:()I
  #206 = Utf8               intValue
  #207 = Utf8               ()I
  #208 = Methodref          #192.#209     // ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
  #209 = NameAndType        #210:#211     // setMessageId:(I)V
  #210 = Utf8               setMessageId
  #211 = Utf8               (I)V
  #212 = String             #213          // addName
  #213 = Utf8               addName
  #214 = Methodref          #192.#215     // ext/mods/gameserver/skills/conditions/Condition.addName:()V
  #215 = NameAndType        #213:#11      // addName:()V
  #216 = Methodref          #217.#218     // ext/mods/gameserver/model/item/kind/Item.attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #217 = Class              #219          // ext/mods/gameserver/model/item/kind/Item
  #218 = NameAndType        #220:#221     // attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #219 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #220 = Utf8               attach
  #221 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;)V
  #222 = InvokeDynamic      #2:#223       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #223 = NameAndType        #158:#224     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #224 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #225 = Methodref          #226.#227     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #226 = Class              #228          // java/lang/Class
  #227 = NameAndType        #229:#230     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #228 = Utf8               java/lang/Class
  #229 = Utf8               forName
  #230 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #231 = Methodref          #226.#232     // java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #232 = NameAndType        #233:#234     // getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #233 = Utf8               getConstructor
  #234 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #235 = Methodref          #236.#237     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #236 = Class              #238          // java/lang/reflect/Constructor
  #237 = NameAndType        #239:#240     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #238 = Utf8               java/lang/reflect/Constructor
  #239 = Utf8               newInstance
  #240 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #241 = Class              #242          // java/lang/reflect/InvocationTargetException
  #242 = Utf8               java/lang/reflect/InvocationTargetException
  #243 = Methodref          #241.#244     // java/lang/reflect/InvocationTargetException."<init>":(Ljava/lang/Throwable;)V
  #244 = NameAndType        #5:#245       // "<init>":(Ljava/lang/Throwable;)V
  #245 = Utf8               (Ljava/lang/Throwable;)V
  #246 = Methodref          #2.#247       // ext/mods/gameserver/data/DocumentBase.parse:()Lorg/w3c/dom/Document;
  #247 = NameAndType        #248:#249     // parse:()Lorg/w3c/dom/Document;
  #248 = Utf8               parse
  #249 = Utf8               ()Lorg/w3c/dom/Document;
  #250 = Utf8               Signature
  #251 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;
  #252 = Utf8               Code
  #253 = Utf8               LineNumberTable
  #254 = Utf8               LocalVariableTable
  #255 = Utf8               this
  #256 = Utf8               Lext/mods/gameserver/data/DocumentItem;
  #257 = Utf8               file
  #258 = Utf8               Ljava/io/File;
  #259 = Utf8               getStatSet
  #260 = Utf8               ()Lext/mods/commons/data/StatSet;
  #261 = Utf8               getTableValue
  #262 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #263 = Utf8               idx
  #264 = Utf8               parseDocument
  #265 = Utf8               (Lorg/w3c/dom/Document;)V
  #266 = Utf8               e
  #267 = Utf8               Ljava/lang/Exception;
  #268 = Utf8               d
  #269 = Utf8               Lorg/w3c/dom/Node;
  #270 = Utf8               n
  #271 = Utf8               doc
  #272 = Utf8               Lorg/w3c/dom/Document;
  #273 = Utf8               StackMapTable
  #274 = Utf8               condition
  #275 = Utf8               Lext/mods/gameserver/skills/conditions/Condition;
  #276 = Utf8               itemId
  #277 = Utf8               className
  #278 = Utf8               itemName
  #279 = Utf8               first
  #280 = Utf8               Exceptions
  #281 = Utf8               c
  #282 = Utf8               Ljava/lang/reflect/Constructor;
  #283 = Utf8               LocalVariableTypeTable
  #284 = Utf8               Ljava/lang/reflect/Constructor<*>;
  #285 = Utf8               getItemList
  #286 = Utf8               ()Ljava/util/List;
  #287 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;
  #288 = Utf8               SourceFile
  #289 = Utf8               DocumentItem.java
  #290 = Utf8               NestMembers
  #291 = Utf8               BootstrapMethods
  #292 = String             #293          // Item created but table node found! Item \u0001
  #293 = Utf8               Item created but table node found! Item \u0001
  #294 = String             #295          // Item created but set node found! Item \u0001
  #295 = Utf8               Item created but set node found! Item \u0001
  #296 = String             #297          // ext.mods.gameserver.model.item.kind.\u0001
  #297 = Utf8               ext.mods.gameserver.model.item.kind.\u0001
  #298 = MethodHandle       6:#299        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #299 = Methodref          #300.#301     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #300 = Class              #302          // java/lang/invoke/StringConcatFactory
  #301 = NameAndType        #158:#303     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #302 = Utf8               java/lang/invoke/StringConcatFactory
  #303 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #304 = Utf8               InnerClasses
  #305 = Utf8               NewItem
  #306 = Class              #307          // java/lang/invoke/MethodHandles$Lookup
  #307 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #308 = Class              #309          // java/lang/invoke/MethodHandles
  #309 = Utf8               java/lang/invoke/MethodHandles
  #310 = Utf8               Lookup
{
  public ext.mods.gameserver.data.DocumentItem(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/data/DocumentBase."<init>":(Ljava/io/File;)V
         5: aload_0
         6: new           #7                  // class java/util/ArrayList
         9: dup
        10: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        13: putfield      #12                 // Field _itemsInFile:Ljava/util/List;
        16: return
      LineNumberTable:
        line 51: 0
        line 47: 5
        line 52: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/DocumentItem;
            0      17     1  file   Ljava/io/File;

  protected ext.mods.commons.data.StatSet getStatSet();
    descriptor: ()Lext/mods/commons/data/StatSet;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
         4: getfield      #22                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
         7: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/DocumentItem;

  protected java.lang.String getTableValue(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _tables:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #38                 // class "[Ljava/lang/String;"
        13: aload_0
        14: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        17: getfield      #40                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.currentLevel:I
        20: aaload
        21: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/data/DocumentItem;
            0      22     1  name   Ljava/lang/String;

  protected java.lang.String getTableValue(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #28                 // Field _tables:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #38                 // class "[Ljava/lang/String;"
        13: iload_2
        14: iconst_1
        15: isub
        16: aaload
        17: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/DocumentItem;
            0      18     1  name   Ljava/lang/String;
            0      18     2   idx   I

  protected void parseDocument(org.w3c.dom.Document);
    descriptor: (Lorg/w3c/dom/Document;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=5, args_size=2
         0: aload_1
         1: invokeinterface #44,  1           // InterfaceMethod org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
         6: astore_2
         7: aload_2
         8: ifnull        140
        11: ldc           #50                 // String list
        13: aload_2
        14: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        19: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        22: ifeq          130
        25: aload_2
        26: invokeinterface #64,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        31: astore_3
        32: aload_3
        33: ifnull        130
        36: ldc           #65                 // String item
        38: aload_3
        39: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        44: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        47: ifeq          120
        50: aload_0
        51: new           #23                 // class ext/mods/gameserver/data/DocumentItem$NewItem
        54: dup
        55: aload_0
        56: invokespecial #67                 // Method ext/mods/gameserver/data/DocumentItem$NewItem."<init>":(Lext/mods/gameserver/data/DocumentItem;)V
        59: putfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        62: aload_0
        63: aload_3
        64: invokevirtual #70                 // Method parseItem:(Lorg/w3c/dom/Node;)V
        67: aload_0
        68: getfield      #12                 // Field _itemsInFile:Ljava/util/List;
        71: aload_0
        72: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        75: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
        78: invokeinterface #77,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        83: pop
        84: aload_0
        85: invokevirtual #83                 // Method resetTable:()V
        88: goto          120
        91: astore        4
        93: getstatic     #88                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        96: ldc           #92                 // String Cannot create item {}.
        98: aload         4
       100: iconst_1
       101: anewarray     #94                 // class java/lang/Object
       104: dup
       105: iconst_0
       106: aload_0
       107: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       110: getfield      #96                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.id:I
       113: invokestatic  #99                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       116: aastore
       117: invokevirtual #105                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       120: aload_3
       121: invokeinterface #111,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       126: astore_3
       127: goto          32
       130: aload_2
       131: invokeinterface #111,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       136: astore_2
       137: goto          7
       140: return
      Exception table:
         from    to  target type
            50    88    91   Class java/lang/Exception
      LineNumberTable:
        line 75: 0
        line 77: 11
        line 79: 25
        line 81: 36
        line 85: 50
        line 86: 62
        line 87: 67
        line 88: 84
        line 93: 88
        line 90: 91
        line 92: 93
        line 79: 120
        line 75: 130
        line 98: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           93      27     4     e   Ljava/lang/Exception;
           32      98     3     d   Lorg/w3c/dom/Node;
            7     133     2     n   Lorg/w3c/dom/Node;
            0     141     0  this   Lext/mods/gameserver/data/DocumentItem;
            0     141     1   doc   Lorg/w3c/dom/Document;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class org/w3c/dom/Node ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class org/w3c/dom/Node ]
        frame_type = 122 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 9

  protected void parseItem(org.w3c.dom.Node) throws java.lang.reflect.InvocationTargetException;
    descriptor: (Lorg/w3c/dom/Node;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=10, args_size=2
         0: aload_1
         1: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: ldc           #118                // String id
         8: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        13: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        18: invokestatic  #128                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        21: istore_2
        22: aload_1
        23: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        28: ldc           #132                // String type
        30: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        35: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        40: astore_3
        41: aload_1
        42: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        47: ldc           #134                // String name
        49: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        54: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        59: astore        4
        61: aload_0
        62: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        65: iload_2
        66: putfield      #96                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.id:I
        69: aload_0
        70: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        73: aload         4
        75: putfield      #136                // Field ext/mods/gameserver/data/DocumentItem$NewItem.name:Ljava/lang/String;
        78: aload_0
        79: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        82: aload_3
        83: putfield      #139                // Field ext/mods/gameserver/data/DocumentItem$NewItem.type:Ljava/lang/String;
        86: aload_0
        87: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
        90: new           #141                // class ext/mods/commons/data/StatSet
        93: dup
        94: invokespecial #143                // Method ext/mods/commons/data/StatSet."<init>":()V
        97: putfield      #22                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
       100: aload_0
       101: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       104: getfield      #22                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
       107: ldc           #144                // String item_id
       109: iload_2
       110: invokevirtual #146                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       113: aload_0
       114: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       117: getfield      #22                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
       120: ldc           #134                // String name
       122: aload         4
       124: invokevirtual #149                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       127: aload_1
       128: invokeinterface #64,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
       133: astore        5
       135: aload         5
       137: astore_1
       138: aload_1
       139: ifnull        471
       142: ldc           #152                // String table
       144: aload_1
       145: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       150: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       153: ifeq          188
       156: aload_0
       157: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       160: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
       163: ifnull        180
       166: new           #154                // class java/lang/IllegalStateException
       169: dup
       170: iload_2
       171: invokedynamic #156,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       176: invokespecial #160                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       179: athrow
       180: aload_0
       181: aload_1
       182: invokevirtual #163                // Method parseTable:(Lorg/w3c/dom/Node;)V
       185: goto          461
       188: ldc           #166                // String set
       190: aload_1
       191: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       196: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       199: ifeq          245
       202: aload_0
       203: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       206: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
       209: ifnull        226
       212: new           #154                // class java/lang/IllegalStateException
       215: dup
       216: iload_2
       217: invokedynamic #167,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       222: invokespecial #160                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       225: athrow
       226: aload_0
       227: aload_1
       228: aload_0
       229: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       232: getfield      #22                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.set:Lext/mods/commons/data/StatSet;
       235: iconst_1
       236: invokestatic  #99                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       239: invokevirtual #168                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       242: goto          461
       245: ldc           #172                // String for
       247: aload_1
       248: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       253: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       256: ifeq          278
       259: aload_0
       260: invokevirtual #174                // Method makeItem:()V
       263: aload_0
       264: aload_1
       265: aload_0
       266: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       269: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
       272: invokevirtual #177                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
       275: goto          461
       278: ldc           #181                // String cond
       280: aload_1
       281: invokeinterface #52,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       286: invokevirtual #58                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       289: ifeq          461
       292: aload_0
       293: invokevirtual #174                // Method makeItem:()V
       296: aload_0
       297: aload_1
       298: invokeinterface #64,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
       303: aload_0
       304: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       307: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
       310: invokevirtual #183                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
       313: astore        6
       315: aload_1
       316: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       321: ldc           #187                // String msg
       323: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       328: astore        7
       330: aload_1
       331: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       336: ldc           #189                // String msgId
       338: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       343: astore        8
       345: aload         6
       347: ifnull        370
       350: aload         7
       352: ifnull        370
       355: aload         6
       357: aload         7
       359: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       364: invokevirtual #191                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
       367: goto          449
       370: aload         6
       372: ifnull        449
       375: aload         8
       377: ifnull        449
       380: aload         6
       382: aload_0
       383: aload         8
       385: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       390: aconst_null
       391: invokevirtual #196                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       394: invokestatic  #200                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       397: invokevirtual #204                // Method java/lang/Integer.intValue:()I
       400: invokevirtual #208                // Method ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
       403: aload_1
       404: invokeinterface #114,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       409: ldc           #212                // String addName
       411: invokeinterface #119,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       416: astore        9
       418: aload         9
       420: ifnull        449
       423: aload_0
       424: aload         8
       426: invokeinterface #125,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       431: aconst_null
       432: invokevirtual #196                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       435: invokestatic  #200                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       438: invokevirtual #204                // Method java/lang/Integer.intValue:()I
       441: ifle          449
       444: aload         6
       446: invokevirtual #214                // Method ext/mods/gameserver/skills/conditions/Condition.addName:()V
       449: aload_0
       450: getfield      #18                 // Field _currentItem:Lext/mods/gameserver/data/DocumentItem$NewItem;
       453: getfield      #74                 // Field ext/mods/gameserver/data/DocumentItem$NewItem.item:Lext/mods/gameserver/model/item/kind/Item;
       456: aload         6
       458: invokevirtual #216                // Method ext/mods/gameserver/model/item/kind/Item.attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
       461: aload_1
       462: invokeinterface #111,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       467: astore_1
       468: goto          138
       471: aload_0
       472: invokevirtual #174                // Method makeItem:()V
       475: return
      LineNumberTable:
        line 102: 0
        line 103: 22
        line 104: 41
        line 106: 61
        line 107: 69
        line 108: 78
        line 109: 86
        line 110: 100
        line 111: 113
        line 113: 127
        line 114: 135
        line 116: 142
        line 118: 156
        line 119: 166
        line 120: 180
        line 122: 188
        line 124: 202
        line 125: 212
        line 126: 226
        line 128: 245
        line 130: 259
        line 131: 263
        line 133: 278
        line 135: 292
        line 136: 296
        line 137: 315
        line 138: 330
        line 140: 345
        line 141: 355
        line 142: 370
        line 144: 380
        line 145: 403
        line 147: 418
        line 148: 444
        line 150: 449
        line 114: 461
        line 153: 471
        line 154: 475
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          418      31     9 addName   Lorg/w3c/dom/Node;
          315     146     6 condition   Lext/mods/gameserver/skills/conditions/Condition;
          330     131     7   msg   Lorg/w3c/dom/Node;
          345     116     8 msgId   Lorg/w3c/dom/Node;
            0     476     0  this   Lext/mods/gameserver/data/DocumentItem;
            0     476     1     n   Lorg/w3c/dom/Node;
           22     454     2 itemId   I
           41     435     3 className   Ljava/lang/String;
           61     415     4 itemName   Ljava/lang/String;
          135     341     5 first   Lorg/w3c/dom/Node;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 138
          locals = [ class ext/mods/gameserver/data/DocumentItem, class org/w3c/dom/Node, int, class java/lang/String, class java/lang/String, class org/w3c/dom/Node ]
          stack = []
        frame_type = 41 /* same */
        frame_type = 7 /* same */
        frame_type = 37 /* same */
        frame_type = 18 /* same */
        frame_type = 32 /* same */
        frame_type = 254 /* append */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node, class org/w3c/dom/Node ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 78
        frame_type = 248 /* chop */
          offset_delta = 11
        frame_type = 9 /* same */
    Exceptions:
      throws java.lang.reflect.InvocationTargetException

  public java.util.List<ext.mods.gameserver.model.item.kind.Item> getItemList();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _itemsInFile:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/DocumentItem;
    Signature: #287                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;

  public org.w3c.dom.Document parse();
    descriptor: ()Lorg/w3c/dom/Document;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #246                // Method ext/mods/gameserver/data/DocumentBase.parse:()Lorg/w3c/dom/Document;
         4: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/DocumentItem;
}
SourceFile: "DocumentItem.java"
NestMembers:
  ext/mods/gameserver/data/DocumentItem$NewItem
BootstrapMethods:
  0: #298 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #292 Item created but table node found! Item \u0001
  1: #298 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 Item created but set node found! Item \u0001
  2: #298 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #296 ext.mods.gameserver.model.item.kind.\u0001
InnerClasses:
  public #305= #23 of #13;                // NewItem=class ext/mods/gameserver/data/DocumentItem$NewItem of class ext/mods/gameserver/data/DocumentItem
  public static final #310= #306 of #308; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
