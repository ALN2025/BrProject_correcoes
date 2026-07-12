// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.ObserveGroup
// File: ext\mods\gameserver\handler\bypasshandlers\ObserveGroup.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/ObserveGroup.class
  Last modified 9 de jul de 2026; size 3088 bytes
  MD5 checksum 5fbc715cf0c3c715cae44e81e7926906
  Compiled from "ObserveGroup.java"
public class ext.mods.gameserver.handler.bypasshandlers.ObserveGroup implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #114                        // ext/mods/gameserver/handler/bypasshandlers/ObserveGroup
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = Methodref          #17.#18       // ext/mods/gameserver/data/xml/ObserverGroupData.getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #17 = Class              #19           // ext/mods/gameserver/data/xml/ObserverGroupData
   #18 = NameAndType        #20:#21       // getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #19 = Utf8               ext/mods/gameserver/data/xml/ObserverGroupData
   #20 = Utf8               getInstance
   #21 = Utf8               ()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #22 = Methodref          #23.#24       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #23 = Class              #25           // java/lang/Integer
   #24 = NameAndType        #26:#27       // parseInt:(Ljava/lang/String;)I
   #25 = Utf8               java/lang/Integer
   #26 = Utf8               parseInt
   #27 = Utf8               (Ljava/lang/String;)I
   #28 = Methodref          #17.#29       // ext/mods/gameserver/data/xml/ObserverGroupData.getObserverLocations:(I)Ljava/util/List;
   #29 = NameAndType        #30:#31       // getObserverLocations:(I)Ljava/util/List;
   #30 = Utf8               getObserverLocations
   #31 = Utf8               (I)Ljava/util/List;
   #32 = Class              #33           // java/lang/StringBuilder
   #33 = Utf8               java/lang/StringBuilder
   #34 = Methodref          #32.#3        // java/lang/StringBuilder."<init>":()V
   #35 = String             #36           // <html><body>&$650;<br><br>
   #36 = Utf8               <html><body>&$650;<br><br>
   #37 = Methodref          #32.#38       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #38 = NameAndType        #39:#40       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #39 = Utf8               append
   #40 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #41 = InterfaceMethodref #42.#43       // java/util/List.iterator:()Ljava/util/Iterator;
   #42 = Class              #44           // java/util/List
   #43 = NameAndType        #45:#46       // iterator:()Ljava/util/Iterator;
   #44 = Utf8               java/util/List
   #45 = Utf8               iterator
   #46 = Utf8               ()Ljava/util/Iterator;
   #47 = InterfaceMethodref #48.#49       // java/util/Iterator.hasNext:()Z
   #48 = Class              #50           // java/util/Iterator
   #49 = NameAndType        #51:#52       // hasNext:()Z
   #50 = Utf8               java/util/Iterator
   #51 = Utf8               hasNext
   #52 = Utf8               ()Z
   #53 = InterfaceMethodref #48.#54       // java/util/Iterator.next:()Ljava/lang/Object;
   #54 = NameAndType        #55:#56       // next:()Ljava/lang/Object;
   #55 = Utf8               next
   #56 = Utf8               ()Ljava/lang/Object;
   #57 = Class              #58           // ext/mods/gameserver/model/location/ObserverLocation
   #58 = Utf8               ext/mods/gameserver/model/location/ObserverLocation
   #59 = String             #60           // <a action=\"bypass -h npc_
   #60 = Utf8               <a action=\"bypass -h npc_
   #61 = Methodref          #62.#63       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #62 = Class              #64           // ext/mods/gameserver/model/actor/Creature
   #63 = NameAndType        #65:#66       // getObjectId:()I
   #64 = Utf8               ext/mods/gameserver/model/actor/Creature
   #65 = Utf8               getObjectId
   #66 = Utf8               ()I
   #67 = Methodref          #23.#68       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #68 = NameAndType        #69:#70       // valueOf:(I)Ljava/lang/Integer;
   #69 = Utf8               valueOf
   #70 = Utf8               (I)Ljava/lang/Integer;
   #71 = String             #72           // _observe
   #72 = Utf8               _observe
   #73 = Methodref          #57.#74       // ext/mods/gameserver/model/location/ObserverLocation.getLocId:()I
   #74 = NameAndType        #75:#66       // getLocId:()I
   #75 = Utf8               getLocId
   #76 = String             #77           // \">&$
   #77 = Utf8               \">&$
   #78 = String             #79           // ;
   #79 = Utf8               ;
   #80 = Methodref          #81.#82       // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #81 = Class              #83           // ext/mods/commons/lang/StringUtil
   #82 = NameAndType        #39:#84       // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #83 = Utf8               ext/mods/commons/lang/StringUtil
   #84 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #85 = Methodref          #57.#86       // ext/mods/gameserver/model/location/ObserverLocation.getCost:()I
   #86 = NameAndType        #87:#66       // getCost:()I
   #87 = Utf8               getCost
   #88 = String             #89           //  -
   #89 = Utf8                -
   #90 = String             #91           //  &#57;
   #91 = Utf8                &#57;
   #92 = String             #93           // </a><br1>
   #93 = Utf8               </a><br1>
   #94 = String             #95           // </body></html>
   #95 = Utf8               </body></html>
   #96 = Class              #97           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #97 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #98 = Methodref          #96.#99       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #99 = NameAndType        #5:#100       // "<init>":(I)V
  #100 = Utf8               (I)V
  #101 = Methodref          #32.#102      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #102 = NameAndType        #103:#15      // toString:()Ljava/lang/String;
  #103 = Utf8               toString
  #104 = Methodref          #96.#105      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #105 = NameAndType        #106:#11      // setHtml:(Ljava/lang/String;)V
  #106 = Utf8               setHtml
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = Class              #110          // ext/mods/gameserver/model/actor/Player
  #109 = NameAndType        #111:#112     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = Utf8               ext/mods/gameserver/model/actor/Player
  #111 = Utf8               sendPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Fieldref           #114.#115     // ext/mods/gameserver/handler/bypasshandlers/ObserveGroup.COMMANDS:[Ljava/lang/String;
  #114 = Class              #116          // ext/mods/gameserver/handler/bypasshandlers/ObserveGroup
  #115 = NameAndType        #117:#118     // COMMANDS:[Ljava/lang/String;
  #116 = Utf8               ext/mods/gameserver/handler/bypasshandlers/ObserveGroup
  #117 = Utf8               COMMANDS
  #118 = Utf8               [Ljava/lang/String;
  #119 = Class              #120          // java/lang/String
  #120 = Utf8               java/lang/String
  #121 = String             #122          // observe_group
  #122 = Utf8               observe_group
  #123 = Class              #124          // ext/mods/gameserver/handler/IBypassHandler
  #124 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               this
  #129 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/ObserveGroup;
  #130 = Utf8               useBypass
  #131 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #132 = Utf8               loc
  #133 = Utf8               Lext/mods/gameserver/model/location/ObserverLocation;
  #134 = Utf8               command
  #135 = Utf8               Ljava/lang/String;
  #136 = Utf8               player
  #137 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #138 = Utf8               target
  #139 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #140 = Utf8               st
  #141 = Utf8               Ljava/util/StringTokenizer;
  #142 = Utf8               locs
  #143 = Utf8               Ljava/util/List;
  #144 = Utf8               sb
  #145 = Utf8               Ljava/lang/StringBuilder;
  #146 = Utf8               html
  #147 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #148 = Utf8               LocalVariableTypeTable
  #149 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;
  #150 = Utf8               StackMapTable
  #151 = Utf8               getBypassList
  #152 = Utf8               ()[Ljava/lang/String;
  #153 = Utf8               <clinit>
  #154 = Utf8               SourceFile
  #155 = Utf8               ObserveGroup.java
{
  public ext.mods.gameserver.handler.bypasshandlers.ObserveGroup();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/ObserveGroup;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore        4
        10: aload         4
        12: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: invokestatic  #16                 // Method ext/mods/gameserver/data/xml/ObserverGroupData.getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
        19: aload         4
        21: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        24: invokestatic  #22                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        27: invokevirtual #28                 // Method ext/mods/gameserver/data/xml/ObserverGroupData.getObserverLocations:(I)Ljava/util/List;
        30: astore        5
        32: aload         5
        34: ifnonnull     39
        37: iconst_0
        38: ireturn
        39: new           #32                 // class java/lang/StringBuilder
        42: dup
        43: invokespecial #34                 // Method java/lang/StringBuilder."<init>":()V
        46: astore        6
        48: aload         6
        50: ldc           #35                 // String <html><body>&$650;<br><br>
        52: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        55: pop
        56: aload         5
        58: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        63: astore        7
        65: aload         7
        67: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        72: ifeq          205
        75: aload         7
        77: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        82: checkcast     #57                 // class ext/mods/gameserver/model/location/ObserverLocation
        85: astore        8
        87: aload         6
        89: bipush        7
        91: anewarray     #2                  // class java/lang/Object
        94: dup
        95: iconst_0
        96: ldc           #59                 // String <a action=\"bypass -h npc_
        98: aastore
        99: dup
       100: iconst_1
       101: aload_3
       102: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       105: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       108: aastore
       109: dup
       110: iconst_2
       111: ldc           #71                 // String _observe
       113: aastore
       114: dup
       115: iconst_3
       116: aload         8
       118: invokevirtual #73                 // Method ext/mods/gameserver/model/location/ObserverLocation.getLocId:()I
       121: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       124: aastore
       125: dup
       126: iconst_4
       127: ldc           #76                 // String \">&$
       129: aastore
       130: dup
       131: iconst_5
       132: aload         8
       134: invokevirtual #73                 // Method ext/mods/gameserver/model/location/ObserverLocation.getLocId:()I
       137: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       140: aastore
       141: dup
       142: bipush        6
       144: ldc           #78                 // String ;
       146: aastore
       147: invokestatic  #80                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       150: aload         8
       152: invokevirtual #85                 // Method ext/mods/gameserver/model/location/ObserverLocation.getCost:()I
       155: ifle          188
       158: aload         6
       160: iconst_3
       161: anewarray     #2                  // class java/lang/Object
       164: dup
       165: iconst_0
       166: ldc           #88                 // String  -
       168: aastore
       169: dup
       170: iconst_1
       171: aload         8
       173: invokevirtual #85                 // Method ext/mods/gameserver/model/location/ObserverLocation.getCost:()I
       176: invokestatic  #67                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       179: aastore
       180: dup
       181: iconst_2
       182: ldc           #90                 // String  &#57;
       184: aastore
       185: invokestatic  #80                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       188: aload         6
       190: iconst_1
       191: anewarray     #2                  // class java/lang/Object
       194: dup
       195: iconst_0
       196: ldc           #92                 // String </a><br1>
       198: aastore
       199: invokestatic  #80                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       202: goto          65
       205: aload         6
       207: ldc           #94                 // String </body></html>
       209: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       212: pop
       213: new           #96                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       216: dup
       217: aload_3
       218: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       221: invokespecial #98                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       224: astore        7
       226: aload         7
       228: aload         6
       230: invokevirtual #101                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       233: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       236: aload_2
       237: aload         7
       239: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       242: iconst_1
       243: ireturn
      LineNumberTable:
        line 39: 0
        line 40: 10
        line 42: 16
        line 43: 32
        line 44: 37
        line 46: 39
        line 47: 48
        line 49: 56
        line 51: 87
        line 53: 150
        line 54: 158
        line 56: 188
        line 57: 202
        line 58: 205
        line 60: 213
        line 61: 226
        line 63: 236
        line 64: 242
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87     115     8   loc   Lext/mods/gameserver/model/location/ObserverLocation;
            0     244     0  this   Lext/mods/gameserver/handler/bypasshandlers/ObserveGroup;
            0     244     1 command   Ljava/lang/String;
            0     244     2 player   Lext/mods/gameserver/model/actor/Player;
            0     244     3 target   Lext/mods/gameserver/model/actor/Creature;
           10     234     4    st   Ljava/util/StringTokenizer;
           32     212     5  locs   Ljava/util/List;
           48     196     6    sb   Ljava/lang/StringBuilder;
          226      18     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32     212     5  locs   Ljava/util/List<Lext/mods/gameserver/model/location/ObserverLocation;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class java/util/StringTokenizer, class java/util/List ]
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/model/location/ObserverLocation ]
        frame_type = 249 /* chop */
          offset_delta = 16

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #113                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/ObserveGroup;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #119                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #121                // String observe_group
         8: aastore
         9: putstatic     #113                // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "ObserveGroup.java"
