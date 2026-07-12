// Bytecode for: ext.mods.email.items.EmailItemSelector
// File: ext\mods\email\items\EmailItemSelector.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/items/EmailItemSelector.class
  Last modified 9 de jul de 2026; size 6591 bytes
  MD5 checksum d3b064d934ab360b25c2e64d8e95b861
  Compiled from "EmailItemSelector.java"
public class ext.mods.email.items.EmailItemSelector
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/email/items/EmailItemSelector
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/email/items/EmailItemSelector.showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
    #8 = Class              #10           // ext/mods/email/items/EmailItemSelector
    #9 = NameAndType        #11:#12       // showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
   #10 = Utf8               ext/mods/email/items/EmailItemSelector
   #11 = Utf8               showAvailableItems
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getInventory
   #18 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItems:()Ljava/util/Set;
   #20 = Class              #22           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #21 = NameAndType        #23:#24       // getItems:()Ljava/util/Set;
   #22 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #23 = Utf8               getItems
   #24 = Utf8               ()Ljava/util/Set;
   #25 = Class              #26           // java/util/ArrayList
   #26 = Utf8               java/util/ArrayList
   #27 = Methodref          #25.#3        // java/util/ArrayList."<init>":()V
   #28 = InterfaceMethodref #29.#30       // java/util/Set.iterator:()Ljava/util/Iterator;
   #29 = Class              #31           // java/util/Set
   #30 = NameAndType        #32:#33       // iterator:()Ljava/util/Iterator;
   #31 = Utf8               java/util/Set
   #32 = Utf8               iterator
   #33 = Utf8               ()Ljava/util/Iterator;
   #34 = InterfaceMethodref #35.#36       // java/util/Iterator.hasNext:()Z
   #35 = Class              #37           // java/util/Iterator
   #36 = NameAndType        #38:#39       // hasNext:()Z
   #37 = Utf8               java/util/Iterator
   #38 = Utf8               hasNext
   #39 = Utf8               ()Z
   #40 = InterfaceMethodref #35.#41       // java/util/Iterator.next:()Ljava/lang/Object;
   #41 = NameAndType        #42:#43       // next:()Ljava/lang/Object;
   #42 = Utf8               next
   #43 = Utf8               ()Ljava/lang/Object;
   #44 = Class              #45           // ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #46 = Methodref          #44.#47       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
   #47 = NameAndType        #48:#39       // isEquipped:()Z
   #48 = Utf8               isEquipped
   #49 = Methodref          #44.#50       // ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
   #50 = NameAndType        #51:#39       // isQuestItem:()Z
   #51 = Utf8               isQuestItem
   #52 = Fieldref           #53.#54       // ext/mods/email/EmailProtectionItems.PROIBIDOS:Ljava/util/List;
   #53 = Class              #55           // ext/mods/email/EmailProtectionItems
   #54 = NameAndType        #56:#57       // PROIBIDOS:Ljava/util/List;
   #55 = Utf8               ext/mods/email/EmailProtectionItems
   #56 = Utf8               PROIBIDOS
   #57 = Utf8               Ljava/util/List;
   #58 = Methodref          #44.#59       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #59 = NameAndType        #60:#61       // getItemId:()I
   #60 = Utf8               getItemId
   #61 = Utf8               ()I
   #62 = Methodref          #63.#64       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #63 = Class              #65           // java/lang/Integer
   #64 = NameAndType        #66:#67       // valueOf:(I)Ljava/lang/Integer;
   #65 = Utf8               java/lang/Integer
   #66 = Utf8               valueOf
   #67 = Utf8               (I)Ljava/lang/Integer;
   #68 = InterfaceMethodref #69.#70       // java/util/List.contains:(Ljava/lang/Object;)Z
   #69 = Class              #71           // java/util/List
   #70 = NameAndType        #72:#73       // contains:(Ljava/lang/Object;)Z
   #71 = Utf8               java/util/List
   #72 = Utf8               contains
   #73 = Utf8               (Ljava/lang/Object;)Z
   #74 = InterfaceMethodref #69.#75       // java/util/List.add:(Ljava/lang/Object;)Z
   #75 = NameAndType        #76:#73       // add:(Ljava/lang/Object;)Z
   #76 = Utf8               add
   #77 = InterfaceMethodref #69.#78       // java/util/List.size:()I
   #78 = NameAndType        #79:#61       // size:()I
   #79 = Utf8               size
   #80 = Double             8.0d
   #82 = Methodref          #83.#84       // java/lang/Math.ceil:(D)D
   #83 = Class              #85           // java/lang/Math
   #84 = NameAndType        #86:#87       // ceil:(D)D
   #85 = Utf8               java/lang/Math
   #86 = Utf8               ceil
   #87 = Utf8               (D)D
   #88 = Methodref          #83.#89       // java/lang/Math.min:(II)I
   #89 = NameAndType        #90:#91       // min:(II)I
   #90 = Utf8               min
   #91 = Utf8               (II)I
   #92 = Class              #93           // java/lang/StringBuilder
   #93 = Utf8               java/lang/StringBuilder
   #94 = Methodref          #92.#3        // java/lang/StringBuilder."<init>":()V
   #95 = String             #96           // <html><title>Email Select Items</title><body><center>
   #96 = Utf8               <html><title>Email Select Items</title><body><center>
   #97 = Methodref          #92.#98       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #98 = NameAndType        #99:#100      // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #99 = Utf8               append
  #100 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #101 = String             #102          // <table width=300><tr><td align=center><font color=\"LEVEL\">Selecionar Itens</font></td></tr></table>
  #102 = Utf8               <table width=300><tr><td align=center><font color=\"LEVEL\">Selecionar Itens</font></td></tr></table>
  #103 = InterfaceMethodref #69.#104      // java/util/List.isEmpty:()Z
  #104 = NameAndType        #105:#39      // isEmpty:()Z
  #105 = Utf8               isEmpty
  #106 = String             #107          // <br><font color=LEVEL>Nenhum item disponível.</font><br>
  #107 = Utf8               <br><font color=LEVEL>Nenhum item disponível.</font><br>
  #108 = String             #109          // <table width=280>
  #109 = Utf8               <table width=280>
  #110 = InterfaceMethodref #69.#111      // java/util/List.get:(I)Ljava/lang/Object;
  #111 = NameAndType        #112:#113     // get:(I)Ljava/lang/Object;
  #112 = Utf8               get
  #113 = Utf8               (I)Ljava/lang/Object;
  #114 = String             #115          // <tr>
  #115 = Utf8               <tr>
  #116 = Methodref          #44.#117      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #117 = NameAndType        #118:#119     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #118 = Utf8               getItem
  #119 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #120 = Methodref          #121.#122     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #121 = Class              #123          // ext/mods/gameserver/model/item/kind/Item
  #122 = NameAndType        #124:#125     // getIcon:()Ljava/lang/String;
  #123 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #124 = Utf8               getIcon
  #125 = Utf8               ()Ljava/lang/String;
  #126 = InvokeDynamic      #0:#127       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #127 = NameAndType        #128:#129     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #128 = Utf8               makeConcatWithConstants
  #129 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #130 = Methodref          #44.#131      // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
  #131 = NameAndType        #132:#125     // getName:()Ljava/lang/String;
  #132 = Utf8               getName
  #133 = Class              #134          // java/lang/String
  #134 = Utf8               java/lang/String
  #135 = String             #136          // Scroll:
  #136 = Utf8               Scroll:
  #137 = String             #138          // Top-Grade
  #138 = Utf8               Top-Grade
  #139 = String             #140          // Sealed
  #140 = Utf8               Sealed
  #141 = String             #142          // Ripe
  #142 = Utf8               Ripe
  #143 = String             #144          // Recipe:
  #144 = Utf8               Recipe:
  #145 = String             #146          // Spellbook -
  #146 = Utf8               Spellbook -
  #147 = String             #148          // Greater Mercenary
  #148 = Utf8               Greater Mercenary
  #149 = String             #150          //
  #150 = Utf8
  #151 = Methodref          #133.#152     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #152 = NameAndType        #153:#154     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #153 = Utf8               replace
  #154 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #155 = Methodref          #133.#156     // java/lang/String.trim:()Ljava/lang/String;
  #156 = NameAndType        #157:#125     // trim:()Ljava/lang/String;
  #157 = Utf8               trim
  #158 = Methodref          #133.#159     // java/lang/String.length:()I
  #159 = NameAndType        #160:#61      // length:()I
  #160 = Utf8               length
  #161 = Methodref          #133.#162     // java/lang/String.substring:(II)Ljava/lang/String;
  #162 = NameAndType        #163:#164     // substring:(II)Ljava/lang/String;
  #163 = Utf8               substring
  #164 = Utf8               (II)Ljava/lang/String;
  #165 = Methodref          #44.#166      // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #166 = NameAndType        #167:#61      // getEnchantLevel:()I
  #167 = Utf8               getEnchantLevel
  #168 = String             #169          // FFFF00
  #169 = Utf8               FFFF00
  #170 = String             #171          // LEVEL
  #171 = Utf8               LEVEL
  #172 = InvokeDynamic      #1:#173       // #1:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #173 = NameAndType        #128:#174     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #174 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #175 = String             #176          // <td width=170>
  #176 = Utf8               <td width=170>
  #177 = Methodref          #44.#178      // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #178 = NameAndType        #179:#39      // isAugmented:()Z
  #179 = Utf8               isAugmented
  #180 = Methodref          #44.#181      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #181 = NameAndType        #182:#61      // getCount:()I
  #182 = Utf8               getCount
  #183 = InvokeDynamic      #2:#184       // #2:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #184 = NameAndType        #128:#185     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #185 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #186 = InvokeDynamic      #3:#184       // #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #187 = String             #188          // </td>
  #188 = Utf8               </td>
  #189 = Methodref          #14.#190      // ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
  #190 = NameAndType        #191:#192     // getTempSelectedItems:()Ljava/util/Map;
  #191 = Utf8               getTempSelectedItems
  #192 = Utf8               ()Ljava/util/Map;
  #193 = Methodref          #44.#194      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #194 = NameAndType        #195:#61      // getObjectId:()I
  #195 = Utf8               getObjectId
  #196 = InterfaceMethodref #197.#198     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #197 = Class              #199          // java/util/Map
  #198 = NameAndType        #200:#73      // containsKey:(Ljava/lang/Object;)Z
  #199 = Utf8               java/util/Map
  #200 = Utf8               containsKey
  #201 = String             #202          // Remover
  #202 = Utf8               Remover
  #203 = String             #204          // Selecionar
  #204 = Utf8               Selecionar
  #205 = InvokeDynamic      #4:#206       // #4:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #206 = NameAndType        #128:#207     // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #207 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
  #208 = String             #209          // </tr>
  #209 = Utf8               </tr>
  #210 = String             #211          // </table><br>
  #211 = Utf8               </table><br>
  #212 = String             #213          // <table width=280><tr>
  #213 = Utf8               <table width=280><tr>
  #214 = InvokeDynamic      #5:#215       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #215 = NameAndType        #128:#216     // makeConcatWithConstants:(I)Ljava/lang/String;
  #216 = Utf8               (I)Ljava/lang/String;
  #217 = String             #218          // <td width=70></td>
  #218 = Utf8               <td width=70></td>
  #219 = InvokeDynamic      #6:#220       // #6:makeConcatWithConstants:(II)Ljava/lang/String;
  #220 = NameAndType        #128:#164     // makeConcatWithConstants:(II)Ljava/lang/String;
  #221 = InvokeDynamic      #7:#215       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #222 = String             #223          // </tr></table><br>
  #223 = Utf8               </tr></table><br>
  #224 = String             #225          // <center><button value=\"Voltar\" action=\"bypass -h voiced_email htm email_main.htm\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></center>
  #225 = Utf8               <center><button value=\"Voltar\" action=\"bypass -h voiced_email htm email_main.htm\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></center>
  #226 = String             #227          // </body></html>
  #227 = Utf8               </body></html>
  #228 = Class              #229          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #229 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #230 = Methodref          #228.#231     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #231 = NameAndType        #5:#232       // "<init>":(I)V
  #232 = Utf8               (I)V
  #233 = Methodref          #92.#234      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #234 = NameAndType        #235:#125     // toString:()Ljava/lang/String;
  #235 = Utf8               toString
  #236 = Methodref          #228.#237     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #237 = NameAndType        #238:#239     // setHtml:(Ljava/lang/String;)V
  #238 = Utf8               setHtml
  #239 = Utf8               (Ljava/lang/String;)V
  #240 = Methodref          #14.#241      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #241 = NameAndType        #242:#243     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #242 = Utf8               sendPacket
  #243 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #244 = Utf8               ITEMS_PER_PAGE
  #245 = Utf8               I
  #246 = Utf8               ConstantValue
  #247 = Integer            8
  #248 = Utf8               Code
  #249 = Utf8               LineNumberTable
  #250 = Utf8               LocalVariableTable
  #251 = Utf8               this
  #252 = Utf8               Lext/mods/email/items/EmailItemSelector;
  #253 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #254 = Utf8               player
  #255 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #256 = Utf8               item
  #257 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #258 = Utf8               palavra
  #259 = Utf8               Ljava/lang/String;
  #260 = Utf8               color
  #261 = Utf8               name
  #262 = Utf8               ocultarPalavras
  #263 = Utf8               [Ljava/lang/String;
  #264 = Utf8               isSelected
  #265 = Utf8               Z
  #266 = Utf8               buttonLabel
  #267 = Utf8               i
  #268 = Utf8               page
  #269 = Utf8               allItems
  #270 = Utf8               Ljava/util/Set;
  #271 = Utf8               filteredItems
  #272 = Utf8               totalPages
  #273 = Utf8               startIndex
  #274 = Utf8               endIndex
  #275 = Utf8               sb
  #276 = Utf8               Ljava/lang/StringBuilder;
  #277 = Utf8               html
  #278 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #279 = Utf8               LocalVariableTypeTable
  #280 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #281 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #282 = Utf8               StackMapTable
  #283 = Class              #263          // "[Ljava/lang/String;"
  #284 = Utf8               SourceFile
  #285 = Utf8               EmailItemSelector.java
  #286 = Utf8               BootstrapMethods
  #287 = String             #288          // <td width=32><img src=\"\u0001\" width=32 height=32></td>
  #288 = Utf8               <td width=32><img src=\"\u0001\" width=32 height=32></td>
  #289 = String             #290          // <font color=\"\u0001\">+\u0001</font> \u0001
  #290 = Utf8               <font color=\"\u0001\">+\u0001</font> \u0001
  #291 = String             #292          // <font color=00FF99>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  #292 = Utf8               <font color=00FF99>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  #293 = String             #294          // <font color=FFFFFF>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  #294 = Utf8               <font color=FFFFFF>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  #295 = String             #296          // <td><button value=\"\u0001\" action=\"bypass -h voiced_email confirm_select_item \u0001 \u0001\" width=80 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #296 = Utf8               <td><button value=\"\u0001\" action=\"bypass -h voiced_email confirm_select_item \u0001 \u0001\" width=80 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #297 = String             #298          // <td align=left><button value=\"&$1037;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #298 = Utf8               <td align=left><button value=\"&$1037;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #299 = String             #300          // <td align=center>Page \u0001 / \u0001</td>
  #300 = Utf8               <td align=center>Page \u0001 / \u0001</td>
  #301 = String             #302          // <td align=right><button value=\"&$1038;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #302 = Utf8               <td align=right><button value=\"&$1038;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  #303 = MethodHandle       6:#304        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #304 = Methodref          #305.#306     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Class              #307          // java/lang/invoke/StringConcatFactory
  #306 = NameAndType        #128:#308     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #307 = Utf8               java/lang/invoke/StringConcatFactory
  #308 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #309 = Utf8               InnerClasses
  #310 = Class              #311          // java/lang/invoke/MethodHandles$Lookup
  #311 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #312 = Class              #313          // java/lang/invoke/MethodHandles
  #313 = Utf8               java/lang/invoke/MethodHandles
  #314 = Utf8               Lookup
{
  public ext.mods.email.items.EmailItemSelector();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/email/items/EmailItemSelector;

  public static void showAvailableItems(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: invokestatic  #7                  // Method showAvailableItems:(Lext/mods/gameserver/model/actor/Player;I)V
         5: return
      LineNumberTable:
        line 35: 0
        line 36: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 player   Lext/mods/gameserver/model/actor/Player;

  public static void showAvailableItems(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=16, args_size=2
         0: aload_0
         1: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItems:()Ljava/util/Set;
         7: astore_2
         8: new           #25                 // class java/util/ArrayList
        11: dup
        12: invokespecial #27                 // Method java/util/ArrayList."<init>":()V
        15: astore_3
        16: aload_2
        17: invokeinterface #28,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore        4
        24: aload         4
        26: invokeinterface #34,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        31: ifeq          104
        34: aload         4
        36: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #44                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        44: astore        5
        46: aload         5
        48: ifnonnull     54
        51: goto          24
        54: aload         5
        56: invokevirtual #46                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        59: ifne          24
        62: aload         5
        64: invokevirtual #49                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
        67: ifne          24
        70: getstatic     #52                 // Field ext/mods/email/EmailProtectionItems.PROIBIDOS:Ljava/util/List;
        73: aload         5
        75: invokevirtual #58                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        78: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        81: invokeinterface #68,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        86: ifeq          92
        89: goto          24
        92: aload_3
        93: aload         5
        95: invokeinterface #74,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       100: pop
       101: goto          24
       104: aload_3
       105: invokeinterface #77,  1           // InterfaceMethod java/util/List.size:()I
       110: i2d
       111: ldc2_w        #80                 // double 8.0d
       114: ddiv
       115: invokestatic  #82                 // Method java/lang/Math.ceil:(D)D
       118: d2i
       119: istore        4
       121: iload         4
       123: ifne          129
       126: iconst_1
       127: istore        4
       129: iload_1
       130: iconst_1
       131: if_icmpge     136
       134: iconst_1
       135: istore_1
       136: iload_1
       137: iload         4
       139: if_icmple     145
       142: iload         4
       144: istore_1
       145: iload_1
       146: iconst_1
       147: isub
       148: bipush        8
       150: imul
       151: istore        5
       153: iload         5
       155: bipush        8
       157: iadd
       158: aload_3
       159: invokeinterface #77,  1           // InterfaceMethod java/util/List.size:()I
       164: invokestatic  #88                 // Method java/lang/Math.min:(II)I
       167: istore        6
       169: new           #92                 // class java/lang/StringBuilder
       172: dup
       173: invokespecial #94                 // Method java/lang/StringBuilder."<init>":()V
       176: astore        7
       178: aload         7
       180: ldc           #95                 // String <html><title>Email Select Items</title><body><center>
       182: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       185: pop
       186: aload         7
       188: ldc           #101                // String <table width=300><tr><td align=center><font color=\"LEVEL\">Selecionar Itens</font></td></tr></table>
       190: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       193: pop
       194: aload_3
       195: invokeinterface #103,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       200: ifeq          214
       203: aload         7
       205: ldc           #106                // String <br><font color=LEVEL>Nenhum item disponível.</font><br>
       207: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       210: pop
       211: goto          667
       214: aload         7
       216: ldc           #108                // String <table width=280>
       218: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       221: pop
       222: iload         5
       224: istore        8
       226: iload         8
       228: iload         6
       230: if_icmpge     560
       233: aload_3
       234: iload         8
       236: invokeinterface #110,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       241: checkcast     #44                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       244: astore        9
       246: aload         7
       248: ldc           #114                // String <tr>
       250: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       253: pop
       254: aload         7
       256: aload         9
       258: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       261: invokevirtual #120                // Method ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
       264: invokedynamic #126,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       269: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       272: pop
       273: aload         9
       275: invokevirtual #130                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       278: astore        10
       280: bipush        7
       282: anewarray     #133                // class java/lang/String
       285: dup
       286: iconst_0
       287: ldc           #135                // String Scroll:
       289: aastore
       290: dup
       291: iconst_1
       292: ldc           #137                // String Top-Grade
       294: aastore
       295: dup
       296: iconst_2
       297: ldc           #139                // String Sealed
       299: aastore
       300: dup
       301: iconst_3
       302: ldc           #141                // String Ripe
       304: aastore
       305: dup
       306: iconst_4
       307: ldc           #143                // String Recipe:
       309: aastore
       310: dup
       311: iconst_5
       312: ldc           #145                // String Spellbook -
       314: aastore
       315: dup
       316: bipush        6
       318: ldc           #147                // String Greater Mercenary
       320: aastore
       321: astore        11
       323: aload         11
       325: astore        12
       327: aload         12
       329: arraylength
       330: istore        13
       332: iconst_0
       333: istore        14
       335: iload         14
       337: iload         13
       339: if_icmpge     369
       342: aload         12
       344: iload         14
       346: aaload
       347: astore        15
       349: aload         10
       351: aload         15
       353: ldc           #149                // String
       355: invokevirtual #151                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       358: invokevirtual #155                // Method java/lang/String.trim:()Ljava/lang/String;
       361: astore        10
       363: iinc          14, 1
       366: goto          335
       369: aload         10
       371: invokevirtual #158                // Method java/lang/String.length:()I
       374: bipush        29
       376: if_icmple     389
       379: aload         10
       381: iconst_0
       382: bipush        29
       384: invokevirtual #161                // Method java/lang/String.substring:(II)Ljava/lang/String;
       387: astore        10
       389: aload         9
       391: invokevirtual #165                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       394: ifle          431
       397: aload         9
       399: invokevirtual #165                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       402: iconst_5
       403: if_icmpne     411
       406: ldc           #168                // String FFFF00
       408: goto          413
       411: ldc           #170                // String LEVEL
       413: astore        12
       415: aload         12
       417: aload         9
       419: invokevirtual #165                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       422: aload         10
       424: invokedynamic #172,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       429: astore        10
       431: aload         7
       433: ldc           #175                // String <td width=170>
       435: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       438: pop
       439: aload         9
       441: invokevirtual #177                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
       444: ifeq          468
       447: aload         7
       449: aload         10
       451: aload         9
       453: invokevirtual #180                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       456: invokedynamic #183,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       461: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       464: pop
       465: goto          486
       468: aload         7
       470: aload         10
       472: aload         9
       474: invokevirtual #180                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       477: invokedynamic #186,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       482: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       485: pop
       486: aload         7
       488: ldc           #187                // String </td>
       490: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       493: pop
       494: aload_0
       495: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
       498: aload         9
       500: invokevirtual #193                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       503: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       506: invokeinterface #196,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       511: istore        12
       513: iload         12
       515: ifeq          523
       518: ldc           #201                // String Remover
       520: goto          525
       523: ldc           #203                // String Selecionar
       525: astore        13
       527: aload         7
       529: aload         13
       531: aload         9
       533: invokevirtual #193                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       536: iload_1
       537: invokedynamic #205,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       542: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       545: pop
       546: aload         7
       548: ldc           #208                // String </tr>
       550: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       553: pop
       554: iinc          8, 1
       557: goto          226
       560: aload         7
       562: ldc           #210                // String </table><br>
       564: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       567: pop
       568: aload         7
       570: ldc           #212                // String <table width=280><tr>
       572: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       575: pop
       576: iload_1
       577: iconst_1
       578: if_icmple     598
       581: aload         7
       583: iload_1
       584: iconst_1
       585: isub
       586: invokedynamic #214,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
       591: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       594: pop
       595: goto          606
       598: aload         7
       600: ldc           #217                // String <td width=70></td>
       602: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       605: pop
       606: aload         7
       608: iload_1
       609: iload         4
       611: invokedynamic #219,  0            // InvokeDynamic #6:makeConcatWithConstants:(II)Ljava/lang/String;
       616: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       619: pop
       620: iload_1
       621: iload         4
       623: if_icmpge     643
       626: aload         7
       628: iload_1
       629: iconst_1
       630: iadd
       631: invokedynamic #221,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
       636: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       639: pop
       640: goto          651
       643: aload         7
       645: ldc           #217                // String <td width=70></td>
       647: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       650: pop
       651: aload         7
       653: ldc           #222                // String </tr></table><br>
       655: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       658: pop
       659: aload         7
       661: ldc           #224                // String <center><button value=\"Voltar\" action=\"bypass -h voiced_email htm email_main.htm\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></center>
       663: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       666: pop
       667: aload         7
       669: ldc           #226                // String </body></html>
       671: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       674: pop
       675: new           #228                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       678: dup
       679: iconst_0
       680: invokespecial #230                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       683: astore        8
       685: aload         8
       687: aload         7
       689: invokevirtual #233                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       692: invokevirtual #236                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       695: aload_0
       696: aload         8
       698: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       701: return
      LineNumberTable:
        line 40: 0
        line 41: 8
        line 43: 16
        line 45: 46
        line 46: 51
        line 48: 54
        line 49: 89
        line 51: 92
        line 52: 101
        line 54: 104
        line 55: 121
        line 56: 126
        line 58: 129
        line 59: 134
        line 60: 136
        line 61: 142
        line 63: 145
        line 64: 153
        line 66: 169
        line 68: 178
        line 69: 186
        line 71: 194
        line 73: 203
        line 77: 214
        line 78: 222
        line 80: 233
        line 81: 246
        line 82: 254
        line 84: 273
        line 86: 280
        line 98: 323
        line 100: 349
        line 98: 363
        line 103: 369
        line 105: 379
        line 108: 389
        line 110: 397
        line 111: 415
        line 114: 431
        line 115: 439
        line 117: 447
        line 122: 468
        line 126: 486
        line 128: 494
        line 129: 513
        line 131: 527
        line 133: 546
        line 78: 554
        line 135: 560
        line 137: 568
        line 138: 576
        line 140: 581
        line 144: 598
        line 147: 606
        line 149: 620
        line 151: 626
        line 155: 643
        line 157: 651
        line 159: 659
        line 162: 667
        line 164: 675
        line 165: 685
        line 166: 695
        line 167: 701
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      55     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          349      14    15 palavra   Ljava/lang/String;
          415      16    12 color   Ljava/lang/String;
          246     308     9  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          280     274    10  name   Ljava/lang/String;
          323     231    11 ocultarPalavras   [Ljava/lang/String;
          513      41    12 isSelected   Z
          527      27    13 buttonLabel   Ljava/lang/String;
          226     334     8     i   I
            0     702     0 player   Lext/mods/gameserver/model/actor/Player;
            0     702     1  page   I
            8     694     2 allItems   Ljava/util/Set;
           16     686     3 filteredItems   Ljava/util/List;
          121     581     4 totalPages   I
          153     549     5 startIndex   I
          169     533     6 endIndex   I
          178     524     7    sb   Ljava/lang/StringBuilder;
          685      17     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     694     2 allItems   Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
           16     686     3 filteredItems   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 25
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ class java/util/Set, class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 37 /* same */
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 6 /* same */
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 68
          locals = [ int, int, class java/lang/StringBuilder ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class java/util/Set, class java/util/List, int, int, int, class java/lang/StringBuilder, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/String, class "[Ljava/lang/String;", class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 33
        frame_type = 19 /* same */
        frame_type = 21 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 17 /* same */
        frame_type = 36 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class java/util/Set, class java/util/List, int, int, int, class java/lang/StringBuilder ]
          stack = []
        frame_type = 37 /* same */
        frame_type = 7 /* same */
        frame_type = 36 /* same */
        frame_type = 7 /* same */
        frame_type = 15 /* same */
}
SourceFile: "EmailItemSelector.java"
BootstrapMethods:
  0: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #287 <td width=32><img src=\"\u0001\" width=32 height=32></td>
  1: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #289 <font color=\"\u0001\">+\u0001</font> \u0001
  2: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #291 <font color=00FF99>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  3: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #293 <font color=FFFFFF>\u0001</font> x<font color=LEVEL>\u0001</font><br1>
  4: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 <td><button value=\"\u0001\" action=\"bypass -h voiced_email confirm_select_item \u0001 \u0001\" width=80 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  5: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 <td align=left><button value=\"&$1037;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
  6: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #299 <td align=center>Page \u0001 / \u0001</td>
  7: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 <td align=right><button value=\"&$1038;\" action=\"bypass -h voiced_email select_items \u0001\" width=75 height=21 back=\"L2UI_CH3.Btn1_normalOn\" fore=\"L2UI_CH3.Btn1_normal\"></td>
InnerClasses:
  public static final #314= #310 of #312; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
