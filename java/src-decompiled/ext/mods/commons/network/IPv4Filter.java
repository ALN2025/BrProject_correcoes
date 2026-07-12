// Bytecode for: ext.mods.commons.network.IPv4Filter
// File: ext\mods\commons\network\IPv4Filter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/network/IPv4Filter.class
  Last modified 9 de jul de 2026; size 3412 bytes
  MD5 checksum b23c487dfcf0f9305b0588b0bd9a7f84
  Compiled from "IPv4Filter.java"
public class ext.mods.commons.network.IPv4Filter implements ext.mods.commons.mmocore.IAcceptFilter,java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/commons/network/IPv4Filter
  super_class: #2                         // java/lang/Object
  interfaces: 2, fields: 2, methods: 5, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/commons/network/IPv4Filter._floods:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/commons/network/IPv4Filter
   #12 = NameAndType        #14:#15       // _floods:Ljava/util/Map;
   #13 = Utf8               ext/mods/commons/network/IPv4Filter
   #14 = Utf8               _floods
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/lang/Thread
   #17 = Utf8               java/lang/Thread
   #18 = Methodref          #16.#19       // java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
   #19 = NameAndType        #5:#20        // "<init>":(Ljava/lang/Runnable;)V
   #20 = Utf8               (Ljava/lang/Runnable;)V
   #21 = Methodref          #2.#22        // java/lang/Object.getClass:()Ljava/lang/Class;
   #22 = NameAndType        #23:#24       // getClass:()Ljava/lang/Class;
   #23 = Utf8               getClass
   #24 = Utf8               ()Ljava/lang/Class;
   #25 = Methodref          #26.#27       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #26 = Class              #28           // java/lang/Class
   #27 = NameAndType        #29:#30       // getSimpleName:()Ljava/lang/String;
   #28 = Utf8               java/lang/Class
   #29 = Utf8               getSimpleName
   #30 = Utf8               ()Ljava/lang/String;
   #31 = Methodref          #16.#32       // java/lang/Thread.setName:(Ljava/lang/String;)V
   #32 = NameAndType        #33:#34       // setName:(Ljava/lang/String;)V
   #33 = Utf8               setName
   #34 = Utf8               (Ljava/lang/String;)V
   #35 = Methodref          #16.#36       // java/lang/Thread.setDaemon:(Z)V
   #36 = NameAndType        #37:#38       // setDaemon:(Z)V
   #37 = Utf8               setDaemon
   #38 = Utf8               (Z)V
   #39 = Methodref          #16.#40       // java/lang/Thread.start:()V
   #40 = NameAndType        #41:#6        // start:()V
   #41 = Utf8               start
   #42 = Methodref          #43.#44       // java/net/Socket.getInetAddress:()Ljava/net/InetAddress;
   #43 = Class              #45           // java/net/Socket
   #44 = NameAndType        #46:#47       // getInetAddress:()Ljava/net/InetAddress;
   #45 = Utf8               java/net/Socket
   #46 = Utf8               getInetAddress
   #47 = Utf8               ()Ljava/net/InetAddress;
   #48 = Methodref          #49.#50       // java/net/InetAddress.getAddress:()[B
   #49 = Class              #51           // java/net/InetAddress
   #50 = NameAndType        #52:#53       // getAddress:()[B
   #51 = Utf8               java/net/InetAddress
   #52 = Utf8               getAddress
   #53 = Utf8               ()[B
   #54 = Methodref          #11.#55       // ext/mods/commons/network/IPv4Filter.hash:([B)I
   #55 = NameAndType        #56:#57       // hash:([B)I
   #56 = Utf8               hash
   #57 = Utf8               ([B)I
   #58 = Methodref          #59.#60       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #59 = Class              #61           // java/lang/Integer
   #60 = NameAndType        #62:#63       // valueOf:(I)Ljava/lang/Integer;
   #61 = Utf8               java/lang/Integer
   #62 = Utf8               valueOf
   #63 = Utf8               (I)Ljava/lang/Integer;
   #64 = InterfaceMethodref #65.#66       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #65 = Class              #67           // java/util/Map
   #66 = NameAndType        #68:#69       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Utf8               java/util/Map
   #68 = Utf8               get
   #69 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Class              #71           // ext/mods/commons/network/IPv4Filter$FloodHolder
   #71 = Utf8               ext/mods/commons/network/IPv4Filter$FloodHolder
   #72 = Methodref          #73.#74       // java/lang/System.currentTimeMillis:()J
   #73 = Class              #75           // java/lang/System
   #74 = NameAndType        #76:#77       // currentTimeMillis:()J
   #75 = Utf8               java/lang/System
   #76 = Utf8               currentTimeMillis
   #77 = Utf8               ()J
   #78 = Fieldref           #70.#79       // ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
   #79 = NameAndType        #80:#81       // tries:I
   #80 = Utf8               tries
   #81 = Utf8               I
   #82 = Fieldref           #70.#83       // ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
   #83 = NameAndType        #84:#85       // lastAccess:J
   #84 = Utf8               lastAccess
   #85 = Utf8               J
   #86 = Long               1000l
   #88 = Methodref          #70.#89       // ext/mods/commons/network/IPv4Filter$FloodHolder."<init>":(Lext/mods/commons/network/IPv4Filter;)V
   #89 = NameAndType        #5:#90        // "<init>":(Lext/mods/commons/network/IPv4Filter;)V
   #90 = Utf8               (Lext/mods/commons/network/IPv4Filter;)V
   #91 = InterfaceMethodref #65.#92       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = NameAndType        #93:#94       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Utf8               put
   #94 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Long               300000l
   #97 = InterfaceMethodref #65.#98       // java/util/Map.values:()Ljava/util/Collection;
   #98 = NameAndType        #99:#100      // values:()Ljava/util/Collection;
   #99 = Utf8               values
  #100 = Utf8               ()Ljava/util/Collection;
  #101 = InvokeDynamic      #0:#102       // #0:test:(J)Ljava/util/function/Predicate;
  #102 = NameAndType        #103:#104     // test:(J)Ljava/util/function/Predicate;
  #103 = Utf8               test
  #104 = Utf8               (J)Ljava/util/function/Predicate;
  #105 = InterfaceMethodref #106.#107     // java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
  #106 = Class              #108          // java/util/Collection
  #107 = NameAndType        #109:#110     // removeIf:(Ljava/util/function/Predicate;)Z
  #108 = Utf8               java/util/Collection
  #109 = Utf8               removeIf
  #110 = Utf8               (Ljava/util/function/Predicate;)Z
  #111 = Long               5000l
  #113 = Methodref          #16.#114      // java/lang/Thread.sleep:(J)V
  #114 = NameAndType        #115:#116     // sleep:(J)V
  #115 = Utf8               sleep
  #116 = Utf8               (J)V
  #117 = Class              #118          // java/lang/InterruptedException
  #118 = Utf8               java/lang/InterruptedException
  #119 = Integer            65280
  #120 = Integer            16711680
  #121 = Integer            -16777216
  #122 = Class              #123          // ext/mods/commons/mmocore/IAcceptFilter
  #123 = Utf8               ext/mods/commons/mmocore/IAcceptFilter
  #124 = Class              #125          // java/lang/Runnable
  #125 = Utf8               java/lang/Runnable
  #126 = Utf8               SLEEP_TIME
  #127 = Utf8               ConstantValue
  #128 = Utf8               Signature
  #129 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/network/IPv4Filter$FloodHolder;>;
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               this
  #134 = Utf8               Lext/mods/commons/network/IPv4Filter;
  #135 = Utf8               t
  #136 = Utf8               Ljava/lang/Thread;
  #137 = Utf8               accept
  #138 = Utf8               (Ljava/net/Socket;)Z
  #139 = Utf8               currentTime
  #140 = Utf8               socket
  #141 = Utf8               Ljava/net/Socket;
  #142 = Utf8               flood
  #143 = Utf8               Lext/mods/commons/network/IPv4Filter$FloodHolder;
  #144 = Utf8               StackMapTable
  #145 = Utf8               run
  #146 = Utf8               e
  #147 = Utf8               Ljava/lang/InterruptedException;
  #148 = Utf8               referenceTime
  #149 = Utf8               ip
  #150 = Utf8               [B
  #151 = Utf8               lambda$run$0
  #152 = Utf8               (JLext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #153 = Utf8               f
  #154 = Utf8               SourceFile
  #155 = Utf8               IPv4Filter.java
  #156 = Utf8               NestMembers
  #157 = Utf8               BootstrapMethods
  #158 = MethodType         #159          //  (Ljava/lang/Object;)Z
  #159 = Utf8               (Ljava/lang/Object;)Z
  #160 = MethodHandle       6:#161        // REF_invokeStatic ext/mods/commons/network/IPv4Filter.lambda$run$0:(JLext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #161 = Methodref          #11.#162      // ext/mods/commons/network/IPv4Filter.lambda$run$0:(JLext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #162 = NameAndType        #151:#152     // lambda$run$0:(JLext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #163 = MethodType         #164          //  (Lext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #164 = Utf8               (Lext/mods/commons/network/IPv4Filter$FloodHolder;)Z
  #165 = MethodHandle       6:#166        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #166 = Methodref          #167.#168     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #167 = Class              #169          // java/lang/invoke/LambdaMetafactory
  #168 = NameAndType        #170:#171     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #169 = Utf8               java/lang/invoke/LambdaMetafactory
  #170 = Utf8               metafactory
  #171 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #172 = Utf8               InnerClasses
  #173 = Utf8               FloodHolder
  #174 = Class              #175          // java/lang/invoke/MethodHandles$Lookup
  #175 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #176 = Class              #177          // java/lang/invoke/MethodHandles
  #177 = Utf8               java/lang/invoke/MethodHandles
  #178 = Utf8               Lookup
{
  public ext.mods.commons.network.IPv4Filter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _floods:Ljava/util/Map;
        15: new           #16                 // class java/lang/Thread
        18: dup
        19: aload_0
        20: invokespecial #18                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
        23: astore_1
        24: aload_1
        25: aload_0
        26: invokevirtual #21                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        29: invokevirtual #25                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        32: invokevirtual #31                 // Method java/lang/Thread.setName:(Ljava/lang/String;)V
        35: aload_1
        36: iconst_1
        37: invokevirtual #35                 // Method java/lang/Thread.setDaemon:(Z)V
        40: aload_1
        41: invokevirtual #39                 // Method java/lang/Thread.start:()V
        44: return
      LineNumberTable:
        line 33: 0
        line 30: 4
        line 34: 15
        line 35: 24
        line 36: 35
        line 37: 40
        line 38: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/commons/network/IPv4Filter;
           24      21     1     t   Ljava/lang/Thread;

  public boolean accept(java.net.Socket);
    descriptor: (Ljava/net/Socket;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #42                 // Method java/net/Socket.getInetAddress:()Ljava/net/InetAddress;
         4: invokevirtual #48                 // Method java/net/InetAddress.getAddress:()[B
         7: invokestatic  #54                 // Method hash:([B)I
        10: istore_2
        11: aload_0
        12: getfield      #10                 // Field _floods:Ljava/util/Map;
        15: iload_2
        16: invokestatic  #58                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: invokeinterface #64,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        24: checkcast     #70                 // class ext/mods/commons/network/IPv4Filter$FloodHolder
        27: astore_3
        28: aload_3
        29: ifnull        110
        32: invokestatic  #72                 // Method java/lang/System.currentTimeMillis:()J
        35: lstore        4
        37: aload_3
        38: getfield      #78                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
        41: iconst_m1
        42: if_icmpne     53
        45: aload_3
        46: lload         4
        48: putfield      #82                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
        51: iconst_0
        52: ireturn
        53: aload_3
        54: getfield      #82                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
        57: ldc2_w        #86                 // long 1000l
        60: ladd
        61: lload         4
        63: lcmp
        64: ifle          101
        67: aload_3
        68: lload         4
        70: putfield      #82                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
        73: aload_3
        74: getfield      #78                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
        77: iconst_3
        78: if_icmplt     88
        81: aload_3
        82: iconst_m1
        83: putfield      #78                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
        86: iconst_0
        87: ireturn
        88: aload_3
        89: dup
        90: getfield      #78                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
        93: iconst_1
        94: iadd
        95: putfield      #78                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.tries:I
        98: goto          107
       101: aload_3
       102: lload         4
       104: putfield      #82                 // Field ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
       107: goto          132
       110: aload_0
       111: getfield      #10                 // Field _floods:Ljava/util/Map;
       114: iload_2
       115: invokestatic  #58                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: new           #70                 // class ext/mods/commons/network/IPv4Filter$FloodHolder
       121: dup
       122: aload_0
       123: invokespecial #88                 // Method ext/mods/commons/network/IPv4Filter$FloodHolder."<init>":(Lext/mods/commons/network/IPv4Filter;)V
       126: invokeinterface #91,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       131: pop
       132: iconst_1
       133: ireturn
      LineNumberTable:
        line 43: 0
        line 45: 11
        line 46: 28
        line 48: 32
        line 50: 37
        line 52: 45
        line 53: 51
        line 56: 53
        line 58: 67
        line 60: 73
        line 62: 81
        line 63: 86
        line 66: 88
        line 69: 101
        line 70: 107
        line 72: 110
        line 74: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      70     4 currentTime   J
            0     134     0  this   Lext/mods/commons/network/IPv4Filter;
            0     134     1 socket   Ljava/net/Socket;
           11     123     2  hash   I
           28     106     3 flood   Lext/mods/commons/network/IPv4Filter$FloodHolder;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ int, class ext/mods/commons/network/IPv4Filter$FloodHolder, long ]
        frame_type = 34 /* same */
        frame_type = 12 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 21 /* same */

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: invokestatic  #72                 // Method java/lang/System.currentTimeMillis:()J
         3: ldc2_w        #95                 // long 300000l
         6: lsub
         7: lstore_1
         8: aload_0
         9: getfield      #10                 // Field _floods:Ljava/util/Map;
        12: invokeinterface #97,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: lload_1
        18: invokedynamic #101,  0            // InvokeDynamic #0:test:(J)Ljava/util/function/Predicate;
        23: invokeinterface #105,  2          // InterfaceMethod java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        28: pop
        29: ldc2_w        #111                // long 5000l
        32: invokestatic  #113                // Method java/lang/Thread.sleep:(J)V
        35: goto          40
        38: astore_3
        39: return
        40: goto          0
      Exception table:
         from    to  target type
            29    35    38   Class java/lang/InterruptedException
      LineNumberTable:
        line 82: 0
        line 84: 8
        line 88: 29
        line 93: 35
        line 90: 38
        line 92: 39
        line 94: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       1     3     e   Ljava/lang/InterruptedException;
            8      32     1 referenceTime   J
            0      43     0  this   Lext/mods/commons/network/IPv4Filter;
      StackMapTable: number_of_entries = 3
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/commons/network/IPv4Filter, long ]
          stack = [ class java/lang/InterruptedException ]
        frame_type = 250 /* chop */
          offset_delta = 1
}
SourceFile: "IPv4Filter.java"
NestMembers:
  ext/mods/commons/network/IPv4Filter$FloodHolder
BootstrapMethods:
  0: #165 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #158 (Ljava/lang/Object;)Z
      #160 REF_invokeStatic ext/mods/commons/network/IPv4Filter.lambda$run$0:(JLext/mods/commons/network/IPv4Filter$FloodHolder;)Z
      #163 (Lext/mods/commons/network/IPv4Filter$FloodHolder;)Z
InnerClasses:
  protected final #173= #70 of #11;       // FloodHolder=class ext/mods/commons/network/IPv4Filter$FloodHolder of class ext/mods/commons/network/IPv4Filter
  public static final #178= #174 of #176; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
