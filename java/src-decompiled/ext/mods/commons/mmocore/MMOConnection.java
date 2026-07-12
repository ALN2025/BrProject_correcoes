// Bytecode for: ext.mods.commons.mmocore.MMOConnection
// File: ext\mods\commons\mmocore\MMOConnection.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/MMOConnection.class
  Last modified 9 de jul de 2026; size 6360 bytes
  MD5 checksum a2acf44dc49b7134f30608d685e015cc
  Compiled from "MMOConnection.java"
public class ext.mods.commons.mmocore.MMOConnection<T extends ext.mods.commons.mmocore.MMOClient<?>> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/mmocore/MMOConnection
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 19, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/mmocore/MMOConnection._selectorThread:Lext/mods/commons/mmocore/SelectorThread;
    #8 = Class              #10           // ext/mods/commons/mmocore/MMOConnection
    #9 = NameAndType        #11:#12       // _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
   #10 = Utf8               ext/mods/commons/mmocore/MMOConnection
   #11 = Utf8               _selectorThread
   #12 = Utf8               Lext/mods/commons/mmocore/SelectorThread;
   #13 = Fieldref           #8.#14        // ext/mods/commons/mmocore/MMOConnection._socket:Ljava/net/Socket;
   #14 = NameAndType        #15:#16       // _socket:Ljava/net/Socket;
   #15 = Utf8               _socket
   #16 = Utf8               Ljava/net/Socket;
   #17 = Methodref          #18.#19       // java/net/Socket.getInetAddress:()Ljava/net/InetAddress;
   #18 = Class              #20           // java/net/Socket
   #19 = NameAndType        #21:#22       // getInetAddress:()Ljava/net/InetAddress;
   #20 = Utf8               java/net/Socket
   #21 = Utf8               getInetAddress
   #22 = Utf8               ()Ljava/net/InetAddress;
   #23 = Fieldref           #8.#24        // ext/mods/commons/mmocore/MMOConnection._address:Ljava/net/InetAddress;
   #24 = NameAndType        #25:#26       // _address:Ljava/net/InetAddress;
   #25 = Utf8               _address
   #26 = Utf8               Ljava/net/InetAddress;
   #27 = Methodref          #18.#28       // java/net/Socket.getChannel:()Ljava/nio/channels/SocketChannel;
   #28 = NameAndType        #29:#30       // getChannel:()Ljava/nio/channels/SocketChannel;
   #29 = Utf8               getChannel
   #30 = Utf8               ()Ljava/nio/channels/SocketChannel;
   #31 = Fieldref           #8.#32        // ext/mods/commons/mmocore/MMOConnection._readableByteChannel:Ljava/nio/channels/ReadableByteChannel;
   #32 = NameAndType        #33:#34       // _readableByteChannel:Ljava/nio/channels/ReadableByteChannel;
   #33 = Utf8               _readableByteChannel
   #34 = Utf8               Ljava/nio/channels/ReadableByteChannel;
   #35 = Fieldref           #8.#36        // ext/mods/commons/mmocore/MMOConnection._writableByteChannel:Ljava/nio/channels/WritableByteChannel;
   #36 = NameAndType        #37:#38       // _writableByteChannel:Ljava/nio/channels/WritableByteChannel;
   #37 = Utf8               _writableByteChannel
   #38 = Utf8               Ljava/nio/channels/WritableByteChannel;
   #39 = Methodref          #18.#40       // java/net/Socket.getPort:()I
   #40 = NameAndType        #41:#42       // getPort:()I
   #41 = Utf8               getPort
   #42 = Utf8               ()I
   #43 = Fieldref           #8.#44        // ext/mods/commons/mmocore/MMOConnection._port:I
   #44 = NameAndType        #45:#46       // _port:I
   #45 = Utf8               _port
   #46 = Utf8               I
   #47 = Fieldref           #8.#48        // ext/mods/commons/mmocore/MMOConnection._selectionKey:Ljava/nio/channels/SelectionKey;
   #48 = NameAndType        #49:#50       // _selectionKey:Ljava/nio/channels/SelectionKey;
   #49 = Utf8               _selectionKey
   #50 = Utf8               Ljava/nio/channels/SelectionKey;
   #51 = Class              #52           // ext/mods/commons/mmocore/NioNetStackList
   #52 = Utf8               ext/mods/commons/mmocore/NioNetStackList
   #53 = Methodref          #51.#3        // ext/mods/commons/mmocore/NioNetStackList."<init>":()V
   #54 = Fieldref           #8.#55        // ext/mods/commons/mmocore/MMOConnection._sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
   #55 = NameAndType        #56:#57       // _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
   #56 = Utf8               _sendQueue
   #57 = Utf8               Lext/mods/commons/mmocore/NioNetStackList;
   #58 = Methodref          #18.#59       // java/net/Socket.setTcpNoDelay:(Z)V
   #59 = NameAndType        #60:#61       // setTcpNoDelay:(Z)V
   #60 = Utf8               setTcpNoDelay
   #61 = Utf8               (Z)V
   #62 = Class              #63           // java/net/SocketException
   #63 = Utf8               java/net/SocketException
   #64 = Methodref          #62.#65       // java/net/SocketException.printStackTrace:()V
   #65 = NameAndType        #66:#6        // printStackTrace:()V
   #66 = Utf8               printStackTrace
   #67 = Fieldref           #8.#68        // ext/mods/commons/mmocore/MMOConnection._client:Lext/mods/commons/mmocore/MMOClient;
   #68 = NameAndType        #69:#70       // _client:Lext/mods/commons/mmocore/MMOClient;
   #69 = Utf8               _client
   #70 = Utf8               Lext/mods/commons/mmocore/MMOClient;
   #71 = Fieldref           #72.#68       // ext/mods/commons/mmocore/SendablePacket._client:Lext/mods/commons/mmocore/MMOClient;
   #72 = Class              #73           // ext/mods/commons/mmocore/SendablePacket
   #73 = Utf8               ext/mods/commons/mmocore/SendablePacket
   #74 = Fieldref           #8.#75        // ext/mods/commons/mmocore/MMOConnection._pendingClose:Z
   #75 = NameAndType        #76:#77       // _pendingClose:Z
   #76 = Utf8               _pendingClose
   #77 = Utf8               Z
   #78 = Methodref          #8.#79        // ext/mods/commons/mmocore/MMOConnection.getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
   #79 = NameAndType        #80:#81       // getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
   #80 = Utf8               getSendQueue
   #81 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList;
   #82 = Methodref          #51.#83       // ext/mods/commons/mmocore/NioNetStackList.addLast:(Ljava/lang/Object;)V
   #83 = NameAndType        #84:#85       // addLast:(Ljava/lang/Object;)V
   #84 = Utf8               addLast
   #85 = Utf8               (Ljava/lang/Object;)V
   #86 = Methodref          #51.#87       // ext/mods/commons/mmocore/NioNetStackList.isEmpty:()Z
   #87 = NameAndType        #88:#89       // isEmpty:()Z
   #88 = Utf8               isEmpty
   #89 = Utf8               ()Z
   #90 = Methodref          #91.#92       // java/nio/channels/SelectionKey.interestOps:()I
   #91 = Class              #93           // java/nio/channels/SelectionKey
   #92 = NameAndType        #94:#42       // interestOps:()I
   #93 = Utf8               java/nio/channels/SelectionKey
   #94 = Utf8               interestOps
   #95 = Methodref          #91.#96       // java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
   #96 = NameAndType        #94:#97       // interestOps:(I)Ljava/nio/channels/SelectionKey;
   #97 = Utf8               (I)Ljava/nio/channels/SelectionKey;
   #98 = Class              #99           // java/nio/channels/CancelledKeyException
   #99 = Utf8               java/nio/channels/CancelledKeyException
  #100 = Methodref          #18.#101      // java/net/Socket.close:()V
  #101 = NameAndType        #102:#6       // close:()V
  #102 = Utf8               close
  #103 = InterfaceMethodref #104.#105     // java/nio/channels/ReadableByteChannel.read:(Ljava/nio/ByteBuffer;)I
  #104 = Class              #106          // java/nio/channels/ReadableByteChannel
  #105 = NameAndType        #107:#108     // read:(Ljava/nio/ByteBuffer;)I
  #106 = Utf8               java/nio/channels/ReadableByteChannel
  #107 = Utf8               read
  #108 = Utf8               (Ljava/nio/ByteBuffer;)I
  #109 = InterfaceMethodref #110.#111     // java/nio/channels/WritableByteChannel.write:(Ljava/nio/ByteBuffer;)I
  #110 = Class              #112          // java/nio/channels/WritableByteChannel
  #111 = NameAndType        #113:#108     // write:(Ljava/nio/ByteBuffer;)I
  #112 = Utf8               java/nio/channels/WritableByteChannel
  #113 = Utf8               write
  #114 = Fieldref           #8.#115       // ext/mods/commons/mmocore/MMOConnection._primaryWriteBuffer:Ljava/nio/ByteBuffer;
  #115 = NameAndType        #116:#117     // _primaryWriteBuffer:Ljava/nio/ByteBuffer;
  #116 = Utf8               _primaryWriteBuffer
  #117 = Utf8               Ljava/nio/ByteBuffer;
  #118 = Methodref          #119.#120     // ext/mods/commons/mmocore/SelectorThread.getPooledBuffer:()Ljava/nio/ByteBuffer;
  #119 = Class              #121          // ext/mods/commons/mmocore/SelectorThread
  #120 = NameAndType        #122:#123     // getPooledBuffer:()Ljava/nio/ByteBuffer;
  #121 = Utf8               ext/mods/commons/mmocore/SelectorThread
  #122 = Utf8               getPooledBuffer
  #123 = Utf8               ()Ljava/nio/ByteBuffer;
  #124 = Methodref          #125.#126     // java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #125 = Class              #127          // java/nio/ByteBuffer
  #126 = NameAndType        #128:#129     // put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #127 = Utf8               java/nio/ByteBuffer
  #128 = Utf8               put
  #129 = Utf8               (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #130 = Methodref          #125.#131     // java/nio/ByteBuffer.remaining:()I
  #131 = NameAndType        #132:#42      // remaining:()I
  #132 = Utf8               remaining
  #133 = Methodref          #125.#134     // java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
  #134 = NameAndType        #135:#123     // flip:()Ljava/nio/ByteBuffer;
  #135 = Utf8               flip
  #136 = Methodref          #125.#137     // java/nio/ByteBuffer.limit:()I
  #137 = NameAndType        #138:#42      // limit:()I
  #138 = Utf8               limit
  #139 = Methodref          #119.#140     // ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
  #140 = NameAndType        #141:#142     // recycleBuffer:(Ljava/nio/ByteBuffer;)V
  #141 = Utf8               recycleBuffer
  #142 = Utf8               (Ljava/nio/ByteBuffer;)V
  #143 = Methodref          #125.#144     // java/nio/ByteBuffer.limit:(I)Ljava/nio/ByteBuffer;
  #144 = NameAndType        #138:#145     // limit:(I)Ljava/nio/ByteBuffer;
  #145 = Utf8               (I)Ljava/nio/ByteBuffer;
  #146 = Methodref          #125.#147     // java/nio/ByteBuffer.compact:()Ljava/nio/ByteBuffer;
  #147 = NameAndType        #148:#123     // compact:()Ljava/nio/ByteBuffer;
  #148 = Utf8               compact
  #149 = Fieldref           #8.#150       // ext/mods/commons/mmocore/MMOConnection._secondaryWriteBuffer:Ljava/nio/ByteBuffer;
  #150 = NameAndType        #151:#117     // _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
  #151 = Utf8               _secondaryWriteBuffer
  #152 = Fieldref           #8.#153       // ext/mods/commons/mmocore/MMOConnection._readBuffer:Ljava/nio/ByteBuffer;
  #153 = NameAndType        #154:#117     // _readBuffer:Ljava/nio/ByteBuffer;
  #154 = Utf8               _readBuffer
  #155 = Methodref          #51.#156      // ext/mods/commons/mmocore/NioNetStackList.clear:()V
  #156 = NameAndType        #157:#6       // clear:()V
  #157 = Utf8               clear
  #158 = Methodref          #119.#159     // ext/mods/commons/mmocore/SelectorThread.closeConnection:(Lext/mods/commons/mmocore/MMOConnection;)V
  #159 = NameAndType        #160:#161     // closeConnection:(Lext/mods/commons/mmocore/MMOConnection;)V
  #160 = Utf8               closeConnection
  #161 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)V
  #162 = Utf8               Signature
  #163 = Utf8               Lext/mods/commons/mmocore/SelectorThread<TT;>;
  #164 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<Lext/mods/commons/mmocore/SendablePacket<TT;>;>;
  #165 = Utf8               TT;
  #166 = Utf8               (Lext/mods/commons/mmocore/SelectorThread;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
  #167 = Utf8               Code
  #168 = Utf8               LineNumberTable
  #169 = Utf8               LocalVariableTable
  #170 = Utf8               e
  #171 = Utf8               Ljava/net/SocketException;
  #172 = Utf8               this
  #173 = Utf8               Lext/mods/commons/mmocore/MMOConnection;
  #174 = Utf8               selectorThread
  #175 = Utf8               socket
  #176 = Utf8               key
  #177 = Utf8               tcpNoDelay
  #178 = Utf8               LocalVariableTypeTable
  #179 = Utf8               Lext/mods/commons/mmocore/MMOConnection<TT;>;
  #180 = Utf8               StackMapTable
  #181 = Utf8               (Lext/mods/commons/mmocore/SelectorThread<TT;>;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
  #182 = Utf8               setClient
  #183 = Utf8               (Lext/mods/commons/mmocore/MMOClient;)V
  #184 = Utf8               client
  #185 = Utf8               (TT;)V
  #186 = Utf8               getClient
  #187 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #188 = Utf8               ()TT;
  #189 = Utf8               sendPacket
  #190 = Utf8               (Lext/mods/commons/mmocore/SendablePacket;)V
  #191 = Utf8               sp
  #192 = Utf8               Lext/mods/commons/mmocore/SendablePacket;
  #193 = Utf8               Lext/mods/commons/mmocore/SendablePacket<TT;>;
  #194 = Class              #195          // java/lang/Throwable
  #195 = Utf8               java/lang/Throwable
  #196 = Utf8               (Lext/mods/commons/mmocore/SendablePacket<TT;>;)V
  #197 = Utf8               getSelectionKey
  #198 = Utf8               ()Ljava/nio/channels/SelectionKey;
  #199 = Utf8               Exceptions
  #200 = Class              #201          // java/io/IOException
  #201 = Utf8               java/io/IOException
  #202 = Utf8               buf
  #203 = Utf8               createWriteBuffer
  #204 = Utf8               temp
  #205 = Utf8               hasPendingWriteBuffer
  #206 = Utf8               movePendingWriteBufferTo
  #207 = Utf8               dest
  #208 = Utf8               setReadBuffer
  #209 = Utf8               getReadBuffer
  #210 = Utf8               isClosed
  #211 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList<Lext/mods/commons/mmocore/SendablePacket<TT;>;>;
  #212 = Utf8               releaseBuffers
  #213 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
  #214 = Utf8               SourceFile
  #215 = Utf8               MMOConnection.java
{
  public ext.mods.commons.mmocore.MMOConnection(ext.mods.commons.mmocore.SelectorThread<T>, java.net.Socket, java.nio.channels.SelectionKey, boolean);
    descriptor: (Lext/mods/commons/mmocore/SelectorThread;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _socket:Ljava/net/Socket;
        14: aload_0
        15: aload_2
        16: invokevirtual #17                 // Method java/net/Socket.getInetAddress:()Ljava/net/InetAddress;
        19: putfield      #23                 // Field _address:Ljava/net/InetAddress;
        22: aload_0
        23: aload_2
        24: invokevirtual #27                 // Method java/net/Socket.getChannel:()Ljava/nio/channels/SocketChannel;
        27: putfield      #31                 // Field _readableByteChannel:Ljava/nio/channels/ReadableByteChannel;
        30: aload_0
        31: aload_2
        32: invokevirtual #27                 // Method java/net/Socket.getChannel:()Ljava/nio/channels/SocketChannel;
        35: putfield      #35                 // Field _writableByteChannel:Ljava/nio/channels/WritableByteChannel;
        38: aload_0
        39: aload_2
        40: invokevirtual #39                 // Method java/net/Socket.getPort:()I
        43: putfield      #43                 // Field _port:I
        46: aload_0
        47: aload_3
        48: putfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
        51: aload_0
        52: new           #51                 // class ext/mods/commons/mmocore/NioNetStackList
        55: dup
        56: invokespecial #53                 // Method ext/mods/commons/mmocore/NioNetStackList."<init>":()V
        59: putfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
        62: aload_0
        63: getfield      #13                 // Field _socket:Ljava/net/Socket;
        66: iload         4
        68: invokevirtual #58                 // Method java/net/Socket.setTcpNoDelay:(Z)V
        71: goto          81
        74: astore        5
        76: aload         5
        78: invokevirtual #64                 // Method java/net/SocketException.printStackTrace:()V
        81: return
      Exception table:
         from    to  target type
            62    71    74   Class java/net/SocketException
      LineNumberTable:
        line 54: 0
        line 55: 4
        line 56: 9
        line 57: 14
        line 59: 22
        line 60: 30
        line 62: 38
        line 63: 46
        line 65: 51
        line 69: 62
        line 74: 71
        line 71: 74
        line 73: 76
        line 75: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           76       5     5     e   Ljava/net/SocketException;
            0      82     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      82     1 selectorThread   Lext/mods/commons/mmocore/SelectorThread;
            0      82     2 socket   Ljava/net/Socket;
            0      82     3   key   Ljava/nio/channels/SelectionKey;
            0      82     4 tcpNoDelay   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
            0      82     1 selectorThread   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/commons/mmocore/MMOConnection, class ext/mods/commons/mmocore/SelectorThread, class java/net/Socket, class java/nio/channels/SelectionKey, int ]
          stack = [ class java/net/SocketException ]
        frame_type = 6 /* same */
    Signature: #181                         // (Lext/mods/commons/mmocore/SelectorThread<TT;>;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V

  final void setClient(T);
    descriptor: (Lext/mods/commons/mmocore/MMOClient;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #67                 // Field _client:Lext/mods/commons/mmocore/MMOClient;
         5: return
      LineNumberTable:
        line 79: 0
        line 80: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0       6     1 client   Lext/mods/commons/mmocore/MMOClient;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
            0       6     1 client   TT;
    Signature: #185                         // (TT;)V

  public final T getClient();
    descriptor: ()Lext/mods/commons/mmocore/MMOClient;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _client:Lext/mods/commons/mmocore/MMOClient;
         4: areturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
    Signature: #188                         // ()TT;

  public final void sendPacket(ext.mods.commons.mmocore.SendablePacket<T>);
    descriptor: (Lext/mods/commons/mmocore/SendablePacket;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #67                 // Field _client:Lext/mods/commons/mmocore/MMOClient;
         5: putfield      #71                 // Field ext/mods/commons/mmocore/SendablePacket._client:Lext/mods/commons/mmocore/MMOClient;
         8: aload_0
         9: getfield      #74                 // Field _pendingClose:Z
        12: ifeq          16
        15: return
        16: aload_0
        17: invokevirtual #78                 // Method getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
        20: dup
        21: astore_2
        22: monitorenter
        23: aload_0
        24: getfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
        27: aload_1
        28: invokevirtual #82                 // Method ext/mods/commons/mmocore/NioNetStackList.addLast:(Ljava/lang/Object;)V
        31: aload_2
        32: monitorexit
        33: goto          41
        36: astore_3
        37: aload_2
        38: monitorexit
        39: aload_3
        40: athrow
        41: aload_0
        42: getfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
        45: invokevirtual #86                 // Method ext/mods/commons/mmocore/NioNetStackList.isEmpty:()Z
        48: ifne          72
        51: aload_0
        52: getfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
        55: aload_0
        56: getfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
        59: invokevirtual #90                 // Method java/nio/channels/SelectionKey.interestOps:()I
        62: iconst_4
        63: ior
        64: invokevirtual #95                 // Method java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
        67: pop
        68: goto          72
        71: astore_2
        72: return
      Exception table:
         from    to  target type
            23    33    36   any
            36    39    36   any
            51    68    71   Class java/nio/channels/CancelledKeyException
      LineNumberTable:
        line 89: 0
        line 91: 8
        line 92: 15
        line 94: 16
        line 96: 23
        line 97: 31
        line 99: 41
        line 103: 51
        line 107: 68
        line 105: 71
        line 109: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      73     1    sp   Lext/mods/commons/mmocore/SendablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
            0      73     1    sp   Lext/mods/commons/mmocore/SendablePacket<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/commons/mmocore/MMOConnection, class ext/mods/commons/mmocore/SendablePacket, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 93 /* same_locals_1_stack_item */
          stack = [ class java/nio/channels/CancelledKeyException ]
        frame_type = 0 /* same */
    Signature: #196                         // (Lext/mods/commons/mmocore/SendablePacket<TT;>;)V

  final java.nio.channels.SelectionKey getSelectionKey();
    descriptor: ()Ljava/nio/channels/SelectionKey;
    flags: (0x0010) ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
         4: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  public final java.net.InetAddress getInetAddress();
    descriptor: ()Ljava/net/InetAddress;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _address:Ljava/net/InetAddress;
         4: areturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  public final int getPort();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _port:I
         4: ireturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  final void close() throws java.io.IOException;
    descriptor: ()V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _socket:Ljava/net/Socket;
         4: invokevirtual #100                // Method java/net/Socket.close:()V
         7: return
      LineNumberTable:
        line 128: 0
        line 129: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
    Exceptions:
      throws java.io.IOException

  final int read(java.nio.ByteBuffer) throws java.io.IOException;
    descriptor: (Ljava/nio/ByteBuffer;)I
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #31                 // Field _readableByteChannel:Ljava/nio/channels/ReadableByteChannel;
         4: aload_1
         5: invokeinterface #103,  2          // InterfaceMethod java/nio/channels/ReadableByteChannel.read:(Ljava/nio/ByteBuffer;)I
        10: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      11     1   buf   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
    Exceptions:
      throws java.io.IOException

  final int write(java.nio.ByteBuffer) throws java.io.IOException;
    descriptor: (Ljava/nio/ByteBuffer;)I
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #35                 // Field _writableByteChannel:Ljava/nio/channels/WritableByteChannel;
         4: aload_1
         5: invokeinterface #109,  2          // InterfaceMethod java/nio/channels/WritableByteChannel.write:(Ljava/nio/ByteBuffer;)I
        10: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      11     1   buf   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
    Exceptions:
      throws java.io.IOException

  final void createWriteBuffer(java.nio.ByteBuffer);
    descriptor: (Ljava/nio/ByteBuffer;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
         4: ifnonnull     30
         7: aload_0
         8: aload_0
         9: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        12: invokevirtual #118                // Method ext/mods/commons/mmocore/SelectorThread.getPooledBuffer:()Ljava/nio/ByteBuffer;
        15: putfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        18: aload_0
        19: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        22: aload_1
        23: invokevirtual #124                // Method java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        26: pop
        27: goto          154
        30: aload_0
        31: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        34: invokevirtual #118                // Method ext/mods/commons/mmocore/SelectorThread.getPooledBuffer:()Ljava/nio/ByteBuffer;
        37: astore_2
        38: aload_2
        39: aload_1
        40: invokevirtual #124                // Method java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        43: pop
        44: aload_2
        45: invokevirtual #130                // Method java/nio/ByteBuffer.remaining:()I
        48: istore_3
        49: aload_0
        50: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        53: invokevirtual #133                // Method java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
        56: pop
        57: aload_0
        58: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        61: invokevirtual #136                // Method java/nio/ByteBuffer.limit:()I
        64: istore        4
        66: iload_3
        67: aload_0
        68: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        71: invokevirtual #130                // Method java/nio/ByteBuffer.remaining:()I
        74: if_icmplt     105
        77: aload_2
        78: aload_0
        79: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        82: invokevirtual #124                // Method java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        85: pop
        86: aload_0
        87: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        90: aload_0
        91: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        94: invokevirtual #139                // Method ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
        97: aload_0
        98: aload_2
        99: putfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       102: goto          154
       105: aload_0
       106: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       109: iload_3
       110: invokevirtual #143                // Method java/nio/ByteBuffer.limit:(I)Ljava/nio/ByteBuffer;
       113: pop
       114: aload_2
       115: aload_0
       116: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       119: invokevirtual #124                // Method java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
       122: pop
       123: aload_0
       124: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       127: iload         4
       129: invokevirtual #143                // Method java/nio/ByteBuffer.limit:(I)Ljava/nio/ByteBuffer;
       132: pop
       133: aload_0
       134: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       137: invokevirtual #146                // Method java/nio/ByteBuffer.compact:()Ljava/nio/ByteBuffer;
       140: pop
       141: aload_0
       142: aload_0
       143: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       146: putfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
       149: aload_0
       150: aload_2
       151: putfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
       154: return
      LineNumberTable:
        line 143: 0
        line 145: 7
        line 146: 18
        line 150: 30
        line 151: 38
        line 153: 44
        line 154: 49
        line 155: 57
        line 157: 66
        line 159: 77
        line 160: 86
        line 161: 97
        line 165: 105
        line 166: 114
        line 167: 123
        line 168: 133
        line 169: 141
        line 170: 149
        line 173: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38     116     2  temp   Ljava/nio/ByteBuffer;
           49     105     3 remaining   I
           66      88     4 limit   I
            0     155     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0     155     1   buf   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     155     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 30 /* same */
        frame_type = 254 /* append */
          offset_delta = 74
          locals = [ class java/nio/ByteBuffer, int, int ]
        frame_type = 248 /* chop */
          offset_delta = 48

  final boolean hasPendingWriteBuffer();
    descriptor: ()Z
    flags: (0x0010) ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  final void movePendingWriteBufferTo(java.nio.ByteBuffer);
    descriptor: (Ljava/nio/ByteBuffer;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
         4: invokevirtual #133                // Method java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
         7: pop
         8: aload_1
         9: aload_0
        10: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        13: invokevirtual #124                // Method java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        16: pop
        17: aload_0
        18: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        21: aload_0
        22: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        25: invokevirtual #139                // Method ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
        28: aload_0
        29: aload_0
        30: getfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
        33: putfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        36: aload_0
        37: aconst_null
        38: putfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
        41: return
      LineNumberTable:
        line 182: 0
        line 183: 8
        line 184: 17
        line 185: 28
        line 186: 36
        line 187: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      42     1  dest   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  final void setReadBuffer(java.nio.ByteBuffer);
    descriptor: (Ljava/nio/ByteBuffer;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #152                // Field _readBuffer:Ljava/nio/ByteBuffer;
         5: return
      LineNumberTable:
        line 191: 0
        line 192: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0       6     1   buf   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  final java.nio.ByteBuffer getReadBuffer();
    descriptor: ()Ljava/nio/ByteBuffer;
    flags: (0x0010) ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #152                // Field _readBuffer:Ljava/nio/ByteBuffer;
         4: areturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  public final boolean isClosed();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #74                 // Field _pendingClose:Z
         4: ireturn
      LineNumberTable:
        line 201: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;

  final ext.mods.commons.mmocore.NioNetStackList<ext.mods.commons.mmocore.SendablePacket<T>> getSendQueue();
    descriptor: ()Lext/mods/commons/mmocore/NioNetStackList;
    flags: (0x0010) ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
         4: areturn
      LineNumberTable:
        line 206: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
    Signature: #211                         // ()Lext/mods/commons/mmocore/NioNetStackList<Lext/mods/commons/mmocore/SendablePacket<TT;>;>;

  public final void close(ext.mods.commons.mmocore.SendablePacket<T>);
    descriptor: (Lext/mods/commons/mmocore/SendablePacket;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #74                 // Field _pendingClose:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #78                 // Method getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
        12: dup
        13: astore_2
        14: monitorenter
        15: aload_0
        16: getfield      #74                 // Field _pendingClose:Z
        19: ifne          42
        22: aload_0
        23: iconst_1
        24: putfield      #74                 // Field _pendingClose:Z
        27: aload_0
        28: getfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
        31: invokevirtual #155                // Method ext/mods/commons/mmocore/NioNetStackList.clear:()V
        34: aload_0
        35: getfield      #54                 // Field _sendQueue:Lext/mods/commons/mmocore/NioNetStackList;
        38: aload_1
        39: invokevirtual #82                 // Method ext/mods/commons/mmocore/NioNetStackList.addLast:(Ljava/lang/Object;)V
        42: aload_2
        43: monitorexit
        44: goto          52
        47: astore_3
        48: aload_2
        49: monitorexit
        50: aload_3
        51: athrow
        52: aload_0
        53: getfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
        56: aload_0
        57: getfield      #47                 // Field _selectionKey:Ljava/nio/channels/SelectionKey;
        60: invokevirtual #90                 // Method java/nio/channels/SelectionKey.interestOps:()I
        63: bipush        -5
        65: iand
        66: invokevirtual #95                 // Method java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
        69: pop
        70: goto          74
        73: astore_2
        74: aload_0
        75: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        78: aload_0
        79: invokevirtual #158                // Method ext/mods/commons/mmocore/SelectorThread.closeConnection:(Lext/mods/commons/mmocore/MMOConnection;)V
        82: return
      Exception table:
         from    to  target type
            15    44    47   any
            47    50    47   any
            52    70    73   Class java/nio/channels/CancelledKeyException
      LineNumberTable:
        line 211: 0
        line 212: 7
        line 214: 8
        line 216: 15
        line 218: 22
        line 219: 27
        line 220: 34
        line 222: 42
        line 226: 52
        line 230: 70
        line 228: 73
        line 232: 74
        line 233: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/commons/mmocore/MMOConnection;
            0      83     1    sp   Lext/mods/commons/mmocore/SendablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
            0      83     1    sp   Lext/mods/commons/mmocore/SendablePacket<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class java/lang/Object ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class java/nio/channels/CancelledKeyException ]
        frame_type = 0 /* same */
    Signature: #196                         // (Lext/mods/commons/mmocore/SendablePacket<TT;>;)V

  final void releaseBuffers();
    descriptor: ()V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
         4: ifnull        46
         7: aload_0
         8: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        11: aload_0
        12: getfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        15: invokevirtual #139                // Method ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
        18: aload_0
        19: aconst_null
        20: putfield      #114                // Field _primaryWriteBuffer:Ljava/nio/ByteBuffer;
        23: aload_0
        24: getfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
        27: ifnull        46
        30: aload_0
        31: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        34: aload_0
        35: getfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
        38: invokevirtual #139                // Method ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
        41: aload_0
        42: aconst_null
        43: putfield      #149                // Field _secondaryWriteBuffer:Ljava/nio/ByteBuffer;
        46: aload_0
        47: getfield      #152                // Field _readBuffer:Ljava/nio/ByteBuffer;
        50: ifnull        69
        53: aload_0
        54: getfield      #7                  // Field _selectorThread:Lext/mods/commons/mmocore/SelectorThread;
        57: aload_0
        58: getfield      #152                // Field _readBuffer:Ljava/nio/ByteBuffer;
        61: invokevirtual #139                // Method ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
        64: aload_0
        65: aconst_null
        66: putfield      #152                // Field _readBuffer:Ljava/nio/ByteBuffer;
        69: return
      LineNumberTable:
        line 237: 0
        line 239: 7
        line 240: 18
        line 242: 23
        line 244: 30
        line 245: 41
        line 249: 46
        line 251: 53
        line 252: 64
        line 254: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/commons/mmocore/MMOConnection<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 46 /* same */
        frame_type = 22 /* same */
}
Signature: #213                         // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
SourceFile: "MMOConnection.java"
