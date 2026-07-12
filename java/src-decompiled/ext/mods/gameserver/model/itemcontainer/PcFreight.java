// Bytecode for: ext.mods.gameserver.model.itemcontainer.PcFreight
// File: ext\mods\gameserver\model\itemcontainer\PcFreight.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/PcFreight.class
  Last modified 9 de jul de 2026; size 4650 bytes
  MD5 checksum 3d194ad1ee39da2a67d1d273664c1c96
  Compiled from "PcFreight.java"
public class ext.mods.gameserver.model.itemcontainer.PcFreight extends ext.mods.gameserver.model.itemcontainer.ItemContainer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/PcFreight
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/ItemContainer
  interfaces: 0, fields: 3, methods: 15, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/itemcontainer/ItemContainer
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/itemcontainer/PcFreight._tempOwnerId:I
    #8 = Class              #10           // ext/mods/gameserver/model/itemcontainer/PcFreight
    #9 = NameAndType        #11:#12       // _tempOwnerId:I
   #10 = Utf8               ext/mods/gameserver/model/itemcontainer/PcFreight
   #11 = Utf8               _tempOwnerId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/itemcontainer/PcFreight._owner:Lext/mods/gameserver/model/actor/Player;
   #14 = NameAndType        #15:#16       // _owner:Lext/mods/gameserver/model/actor/Player;
   #15 = Utf8               _owner
   #16 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #17 = String             #18           // Freight
   #18 = Utf8               Freight
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/enums/items/ItemLocation.FREIGHT:Lext/mods/gameserver/enums/items/ItemLocation;
   #20 = Class              #22           // ext/mods/gameserver/enums/items/ItemLocation
   #21 = NameAndType        #23:#24       // FREIGHT:Lext/mods/gameserver/enums/items/ItemLocation;
   #22 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #23 = Utf8               FREIGHT
   #24 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/itemcontainer/PcFreight._activeLocationId:I
   #26 = NameAndType        #27:#12       // _activeLocationId:I
   #27 = Utf8               _activeLocationId
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/itemcontainer/PcFreight._items:Ljava/util/Set;
   #29 = NameAndType        #30:#31       // _items:Ljava/util/Set;
   #30 = Utf8               _items
   #31 = Utf8               Ljava/util/Set;
   #32 = InterfaceMethodref #33.#34       // java/util/Set.iterator:()Ljava/util/Iterator;
   #33 = Class              #35           // java/util/Set
   #34 = NameAndType        #36:#37       // iterator:()Ljava/util/Iterator;
   #35 = Utf8               java/util/Set
   #36 = Utf8               iterator
   #37 = Utf8               ()Ljava/util/Iterator;
   #38 = InterfaceMethodref #39.#40       // java/util/Iterator.hasNext:()Z
   #39 = Class              #41           // java/util/Iterator
   #40 = NameAndType        #42:#43       // hasNext:()Z
   #41 = Utf8               java/util/Iterator
   #42 = Utf8               hasNext
   #43 = Utf8               ()Z
   #44 = InterfaceMethodref #39.#45       // java/util/Iterator.next:()Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // next:()Ljava/lang/Object;
   #46 = Utf8               next
   #47 = Utf8               ()Ljava/lang/Object;
   #48 = Class              #49           // ext/mods/gameserver/model/item/instance/ItemInstance
   #49 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #50 = Methodref          #48.#51       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
   #51 = NameAndType        #52:#53       // getLocationSlot:()I
   #52 = Utf8               getLocationSlot
   #53 = Utf8               ()I
   #54 = InterfaceMethodref #33.#55       // java/util/Set.isEmpty:()Z
   #55 = NameAndType        #56:#43       // isEmpty:()Z
   #56 = Utf8               isEmpty
   #57 = Methodref          #58.#59       // java/util/Collections.emptySet:()Ljava/util/Set;
   #58 = Class              #60           // java/util/Collections
   #59 = NameAndType        #61:#62       // emptySet:()Ljava/util/Set;
   #60 = Utf8               java/util/Collections
   #61 = Utf8               emptySet
   #62 = Utf8               ()Ljava/util/Set;
   #63 = InterfaceMethodref #33.#64       // java/util/Set.stream:()Ljava/util/stream/Stream;
   #64 = NameAndType        #65:#66       // stream:()Ljava/util/stream/Stream;
   #65 = Utf8               stream
   #66 = Utf8               ()Ljava/util/stream/Stream;
   #67 = InvokeDynamic      #0:#68        // #0:test:(Lext/mods/gameserver/model/itemcontainer/PcFreight;)Ljava/util/function/Predicate;
   #68 = NameAndType        #69:#70       // test:(Lext/mods/gameserver/model/itemcontainer/PcFreight;)Ljava/util/function/Predicate;
   #69 = Utf8               test
   #70 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcFreight;)Ljava/util/function/Predicate;
   #71 = InterfaceMethodref #72.#73       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #72 = Class              #74           // java/util/stream/Stream
   #73 = NameAndType        #75:#76       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #74 = Utf8               java/util/stream/Stream
   #75 = Utf8               filter
   #76 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #77 = Methodref          #78.#79       // java/util/stream/Collectors.toSet:()Ljava/util/stream/Collector;
   #78 = Class              #80           // java/util/stream/Collectors
   #79 = NameAndType        #81:#82       // toSet:()Ljava/util/stream/Collector;
   #80 = Utf8               java/util/stream/Collectors
   #81 = Utf8               toSet
   #82 = Utf8               ()Ljava/util/stream/Collector;
   #83 = InterfaceMethodref #72.#84       // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #84 = NameAndType        #85:#86       // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #85 = Utf8               collect
   #86 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #87 = Methodref          #48.#88       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #88 = NameAndType        #89:#53       // getItemId:()I
   #89 = Utf8               getItemId
   #90 = Methodref          #2.#91        // ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #91 = NameAndType        #92:#93       // addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #92 = Utf8               addBasicItem
   #93 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #94 = Methodref          #48.#95       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #95 = NameAndType        #96:#97       // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #96 = Utf8               getLocation
   #97 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
   #98 = Methodref          #48.#99       // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
   #99 = NameAndType        #100:#101     // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #100 = Utf8               setLocation
  #101 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #102 = Methodref          #2.#103       // ext/mods/gameserver/model/itemcontainer/ItemContainer.restore:()V
  #103 = NameAndType        #104:#6       // restore:()V
  #104 = Utf8               restore
  #105 = Methodref          #8.#106       // ext/mods/gameserver/model/itemcontainer/PcFreight.getSize:()I
  #106 = NameAndType        #107:#53      // getSize:()I
  #107 = Utf8               getSize
  #108 = Fieldref           #109.#110     // ext/mods/Config.FREIGHT_SLOTS:I
  #109 = Class              #111          // ext/mods/Config
  #110 = NameAndType        #112:#12      // FREIGHT_SLOTS:I
  #111 = Utf8               ext/mods/Config
  #112 = Utf8               FREIGHT_SLOTS
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #114 = Class              #116          // ext/mods/gameserver/model/actor/Player
  #115 = NameAndType        #117:#118     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #116 = Utf8               ext/mods/gameserver/model/actor/Player
  #117 = Utf8               getStatus
  #118 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/actor/status/PlayerStatus.getFreightLimit:()I
  #120 = Class              #122          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #121 = NameAndType        #123:#53      // getFreightLimit:()I
  #122 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #123 = Utf8               getFreightLimit
  #124 = Methodref          #2.#125       // ext/mods/gameserver/model/itemcontainer/ItemContainer.getOwnerId:()I
  #125 = NameAndType        #126:#53      // getOwnerId:()I
  #126 = Utf8               getOwnerId
  #127 = Methodref          #8.#103       // ext/mods/gameserver/model/itemcontainer/PcFreight.restore:()V
  #128 = Methodref          #8.#129       // ext/mods/gameserver/model/itemcontainer/PcFreight.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #129 = NameAndType        #130:#131     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #130 = Utf8               getOwner
  #131 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #138 = Utf8               owner
  #139 = Utf8               getName
  #140 = Utf8               ()Ljava/lang/String;
  #141 = Utf8               getBaseLocation
  #142 = Utf8               setActiveLocation
  #143 = Utf8               (I)V
  #144 = Utf8               locationId
  #145 = Utf8               item
  #146 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #147 = Utf8               size
  #148 = Utf8               StackMapTable
  #149 = Utf8               getItems
  #150 = Utf8               Signature
  #151 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #152 = Utf8               getItemByItemId
  #153 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #154 = Utf8               itemId
  #155 = Utf8               validateCapacity
  #156 = Utf8               (I)Z
  #157 = Utf8               slotCount
  #158 = Utf8               doQuickRestore
  #159 = Utf8               val
  #160 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #161 = Utf8               lambda$getItems$0
  #162 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #163 = Utf8               i
  #164 = Utf8               SourceFile
  #165 = Utf8               PcFreight.java
  #166 = Utf8               BootstrapMethods
  #167 = MethodType         #168          //  (Ljava/lang/Object;)Z
  #168 = Utf8               (Ljava/lang/Object;)Z
  #169 = MethodHandle       5:#170        // REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcFreight.lambda$getItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #170 = Methodref          #8.#171       // ext/mods/gameserver/model/itemcontainer/PcFreight.lambda$getItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #171 = NameAndType        #161:#162     // lambda$getItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #172 = MethodType         #162          //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #173 = MethodHandle       6:#174        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #174 = Methodref          #175.#176     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #175 = Class              #177          // java/lang/invoke/LambdaMetafactory
  #176 = NameAndType        #178:#179     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #177 = Utf8               java/lang/invoke/LambdaMetafactory
  #178 = Utf8               metafactory
  #179 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #180 = Utf8               InnerClasses
  #181 = Class              #182          // java/lang/invoke/MethodHandles$Lookup
  #182 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #183 = Class              #184          // java/lang/invoke/MethodHandles
  #184 = Utf8               java/lang/invoke/MethodHandles
  #185 = Utf8               Lookup
{
  public ext.mods.gameserver.model.itemcontainer.PcFreight(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _tempOwnerId:I
         9: aload_0
        10: aload_1
        11: putfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        14: return
      LineNumberTable:
        line 37: 0
        line 34: 4
        line 38: 9
        line 39: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0      15     1 owner   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #17                 // String Freight
         2: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;

  public ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #19                 // Field ext/mods/gameserver/enums/items/ItemLocation.FREIGHT:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;

  public void setActiveLocation(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #25                 // Field _activeLocationId:I
         5: return
      LineNumberTable:
        line 61: 0
        line 62: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0       6     1 locationId   I

  public int getSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #28                 // Field _items:Ljava/util/Set;
         6: invokeinterface #32,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          62
        21: aload_2
        22: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #48                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        30: astore_3
        31: aload_3
        32: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
        35: ifeq          56
        38: aload_0
        39: getfield      #25                 // Field _activeLocationId:I
        42: ifeq          56
        45: aload_3
        46: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
        49: aload_0
        50: getfield      #25                 // Field _activeLocationId:I
        53: if_icmpne     59
        56: iinc          1, 1
        59: goto          12
        62: iload_1
        63: ireturn
      LineNumberTable:
        line 67: 0
        line 68: 2
        line 70: 31
        line 71: 56
        line 72: 59
        line 73: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      28     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      64     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            2      62     1  size   I
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.util.Set<ext.mods.gameserver.model.item.instance.ItemInstance> getItems();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _items:Ljava/util/Set;
         4: invokeinterface #54,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          16
        12: invokestatic  #57                 // Method java/util/Collections.emptySet:()Ljava/util/Set;
        15: areturn
        16: aload_0
        17: getfield      #28                 // Field _items:Ljava/util/Set;
        20: invokeinterface #63,  1           // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        25: aload_0
        26: invokedynamic #67,  0             // InvokeDynamic #0:test:(Lext/mods/gameserver/model/itemcontainer/PcFreight;)Ljava/util/function/Predicate;
        31: invokeinterface #71,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        36: invokestatic  #77                 // Method java/util/stream/Collectors.toSet:()Ljava/util/stream/Collector;
        39: invokeinterface #83,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        44: checkcast     #33                 // class java/util/Set
        47: areturn
      LineNumberTable:
        line 79: 0
        line 80: 12
        line 82: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */
    Signature: #151                         // ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public ext.mods.gameserver.model.item.instance.ItemInstance getItemByItemId(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _items:Ljava/util/Set;
         4: invokeinterface #32,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          67
        19: aload_2
        20: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #48                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        28: astore_3
        29: aload_3
        30: invokevirtual #87                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        33: iload_1
        34: if_icmpne     64
        37: aload_3
        38: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
        41: ifeq          62
        44: aload_0
        45: getfield      #25                 // Field _activeLocationId:I
        48: ifeq          62
        51: aload_3
        52: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
        55: aload_0
        56: getfield      #25                 // Field _activeLocationId:I
        59: if_icmpne     64
        62: aload_3
        63: areturn
        64: goto          10
        67: aconst_null
        68: areturn
      LineNumberTable:
        line 88: 0
        line 90: 29
        line 91: 62
        line 92: 64
        line 93: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      35     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      69     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0      69     1 itemId   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 250 /* chop */
          offset_delta = 2

  protected void addBasicItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #90                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
         5: aload_0
         6: getfield      #25                 // Field _activeLocationId:I
         9: ifle          24
        12: aload_1
        13: aload_1
        14: invokevirtual #94                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        17: aload_0
        18: getfield      #25                 // Field _activeLocationId:I
        21: invokevirtual #98                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
        24: return
      LineNumberTable:
        line 99: 0
        line 101: 5
        line 102: 12
        line 103: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0      25     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _activeLocationId:I
         4: istore_1
         5: aload_0
         6: iconst_0
         7: putfield      #25                 // Field _activeLocationId:I
        10: aload_0
        11: invokespecial #102                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.restore:()V
        14: aload_0
        15: iload_1
        16: putfield      #25                 // Field _activeLocationId:I
        19: return
      LineNumberTable:
        line 108: 0
        line 109: 5
        line 111: 10
        line 113: 14
        line 114: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            5      15     1 locationId   I

  public boolean validateCapacity(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ifne          6
         4: iconst_1
         5: ireturn
         6: aload_0
         7: invokevirtual #105                // Method getSize:()I
        10: iload_1
        11: iadd
        12: aload_0
        13: getfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        16: ifnonnull     25
        19: getstatic     #108                // Field ext/mods/Config.FREIGHT_SLOTS:I
        22: goto          35
        25: aload_0
        26: getfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        32: invokevirtual #119                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getFreightLimit:()I
        35: if_icmpgt     42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 119: 0
        line 120: 4
        line 122: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0      44     1 slotCount   I
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcFreight, int ]
          stack = [ int, int ]
        frame_type = 6 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     14
         7: aload_0
         8: getfield      #7                  // Field _tempOwnerId:I
        11: goto          18
        14: aload_0
        15: invokespecial #124                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getOwnerId:()I
        18: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void doQuickRestore(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _tempOwnerId:I
         5: aload_0
         6: invokevirtual #127                // Method restore:()V
         9: return
      LineNumberTable:
        line 137: 0
        line 139: 5
        line 140: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0      10     1   val   I

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #128                // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcFreight;
}
SourceFile: "PcFreight.java"
BootstrapMethods:
  0: #173 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #167 (Ljava/lang/Object;)Z
      #169 REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcFreight.lambda$getItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #172 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
InnerClasses:
  public static final #185= #181 of #183; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
