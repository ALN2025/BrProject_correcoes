// Bytecode for: ext.mods.gameserver.model.TimeAttackEventRoom
// File: ext\mods\gameserver\model\TimeAttackEventRoom.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/TimeAttackEventRoom.class
  Last modified 9 de jul de 2026; size 2041 bytes
  MD5 checksum af60b47d21d288852fd181bf80684526
  Compiled from "TimeAttackEventRoom.java"
public class ext.mods.gameserver.model.TimeAttackEventRoom
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/TimeAttackEventRoom
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/concurrent/ConcurrentHashMap
   #8 = Utf8               java/util/concurrent/ConcurrentHashMap
   #9 = Methodref          #7.#3          // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/model/TimeAttackEventRoom.eventRoomMap:Ljava/util/Map;
  #11 = Class              #13            // ext/mods/gameserver/model/TimeAttackEventRoom
  #12 = NameAndType        #14:#15        // eventRoomMap:Ljava/util/Map;
  #13 = Utf8               ext/mods/gameserver/model/TimeAttackEventRoom
  #14 = Utf8               eventRoomMap
  #15 = Utf8               Ljava/util/Map;
  #16 = Class              #17            // ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
  #17 = Utf8               ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
  #18 = Methodref          #16.#19        // ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex."<init>":(II)V
  #19 = NameAndType        #5:#20         // "<init>":(II)V
  #20 = Utf8               (II)V
  #21 = InterfaceMethodref #22.#23        // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #22 = Class              #24            // java/util/Map
  #23 = NameAndType        #25:#26        // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #24 = Utf8               java/util/Map
  #25 = Utf8               remove
  #26 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/model/group/Party.getMembersCount:()I
  #28 = Class              #30            // ext/mods/gameserver/model/group/Party
  #29 = NameAndType        #31:#32        // getMembersCount:()I
  #30 = Utf8               ext/mods/gameserver/model/group/Party
  #31 = Utf8               getMembersCount
  #32 = Utf8               ()I
  #33 = InterfaceMethodref #22.#34        // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #34 = NameAndType        #35:#26        // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #35 = Utf8               get
  #36 = InterfaceMethodref #22.#37        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #37 = NameAndType        #38:#39        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #38 = Utf8               put
  #39 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #40 = Fieldref           #41.#42        // ext/mods/gameserver/model/TimeAttackEventRoom$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/TimeAttackEventRoom;
  #41 = Class              #43            // ext/mods/gameserver/model/TimeAttackEventRoom$SingletonHolder
  #42 = NameAndType        #44:#45        // INSTANCE:Lext/mods/gameserver/model/TimeAttackEventRoom;
  #43 = Utf8               ext/mods/gameserver/model/TimeAttackEventRoom$SingletonHolder
  #44 = Utf8               INSTANCE
  #45 = Utf8               Lext/mods/gameserver/model/TimeAttackEventRoom;
  #46 = Utf8               Signature
  #47 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex;Lext/mods/gameserver/model/group/Party;>;
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               clear
  #53 = Utf8               (II)Z
  #54 = Utf8               index
  #55 = Utf8               I
  #56 = Utf8               partType
  #57 = Utf8               StackMapTable
  #58 = Utf8               addParty
  #59 = Utf8               (IILext/mods/gameserver/model/group/Party;)Z
  #60 = Utf8               party
  #61 = Utf8               Lext/mods/gameserver/model/group/Party;
  #62 = Utf8               rindex
  #63 = Utf8               Lext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex;
  #64 = Utf8               oldParty
  #65 = Utf8               getParty
  #66 = Utf8               (II)Lext/mods/gameserver/model/group/Party;
  #67 = Utf8               getInstance
  #68 = Utf8               ()Lext/mods/gameserver/model/TimeAttackEventRoom;
  #69 = Utf8               SourceFile
  #70 = Utf8               TimeAttackEventRoom.java
  #71 = Utf8               NestMembers
  #72 = Utf8               InnerClasses
  #73 = Utf8               RoomIndex
  #74 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.TimeAttackEventRoom();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field eventRoomMap:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 25: 0
        line 27: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/TimeAttackEventRoom;

  public boolean clear(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field eventRoomMap:Ljava/util/Map;
         4: new           #16                 // class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
         7: dup
         8: iload_1
         9: iload_2
        10: invokespecial #18                 // Method ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex."<init>":(II)V
        13: invokeinterface #21,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        18: ifnull        25
        21: iconst_1
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/TimeAttackEventRoom;
            0      27     1 index   I
            0      27     2 partType   I
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public synchronized boolean addParty(int, int, ext.mods.gameserver.model.group.Party);
    descriptor: (IILext/mods/gameserver/model/group/Party;)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=6, args_size=4
         0: aload_3
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_3
         7: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
        10: ifne          15
        13: iconst_0
        14: ireturn
        15: new           #16                 // class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
        18: dup
        19: iload_1
        20: iload_2
        21: invokespecial #18                 // Method ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex."<init>":(II)V
        24: astore        4
        26: aload_0
        27: getfield      #10                 // Field eventRoomMap:Ljava/util/Map;
        30: aload         4
        32: invokeinterface #33,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #28                 // class ext/mods/gameserver/model/group/Party
        40: astore        5
        42: aload         5
        44: ifnull        57
        47: aload         5
        49: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
        52: ifle          57
        55: iconst_0
        56: ireturn
        57: aload_0
        58: getfield      #10                 // Field eventRoomMap:Ljava/util/Map;
        61: aload         4
        63: aload_3
        64: invokeinterface #36,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        69: pop
        70: iconst_1
        71: ireturn
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 39: 6
        line 40: 13
        line 42: 15
        line 43: 26
        line 44: 42
        line 45: 55
        line 47: 57
        line 48: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/TimeAttackEventRoom;
            0      72     1 index   I
            0      72     2 partType   I
            0      72     3 party   Lext/mods/gameserver/model/group/Party;
           26      46     4 rindex   Lext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex;
           42      30     5 oldParty   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex, class ext/mods/gameserver/model/group/Party ]

  public synchronized ext.mods.gameserver.model.group.Party getParty(int, int);
    descriptor: (II)Lext/mods/gameserver/model/group/Party;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=5, args_size=3
         0: new           #16                 // class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #18                 // Method ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex."<init>":(II)V
         9: astore_3
        10: aload_0
        11: getfield      #10                 // Field eventRoomMap:Ljava/util/Map;
        14: aload_3
        15: invokeinterface #33,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #28                 // class ext/mods/gameserver/model/group/Party
        23: astore        4
        25: aload         4
        27: ifnull        52
        30: aload         4
        32: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
        35: ifle          41
        38: aload         4
        40: areturn
        41: aload_0
        42: getfield      #10                 // Field eventRoomMap:Ljava/util/Map;
        45: aload_3
        46: invokeinterface #21,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        51: pop
        52: aconst_null
        53: areturn
      LineNumberTable:
        line 53: 0
        line 54: 10
        line 55: 25
        line 57: 30
        line 58: 38
        line 60: 41
        line 62: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/TimeAttackEventRoom;
            0      54     1 index   I
            0      54     2 partType   I
           10      44     3 rindex   Lext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex;
           25      29     4 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex, class ext/mods/gameserver/model/group/Party ]
        frame_type = 10 /* same */

  public static ext.mods.gameserver.model.TimeAttackEventRoom getInstance();
    descriptor: ()Lext/mods/gameserver/model/TimeAttackEventRoom;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #40                 // Field ext/mods/gameserver/model/TimeAttackEventRoom$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/TimeAttackEventRoom;
         3: areturn
      LineNumberTable:
        line 71: 0
}
SourceFile: "TimeAttackEventRoom.java"
NestMembers:
  ext/mods/gameserver/model/TimeAttackEventRoom$SingletonHolder
  ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex
InnerClasses:
  static final #73= #16 of #11;           // RoomIndex=class ext/mods/gameserver/model/TimeAttackEventRoom$RoomIndex of class ext/mods/gameserver/model/TimeAttackEventRoom
