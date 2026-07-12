// Bytecode for: ext.mods.commons.mmocore.SelectorThread
// File: ext\mods\commons\mmocore\SelectorThread.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/SelectorThread.class
  Last modified 9 de jul de 2026; size 16116 bytes
  MD5 checksum 3d50b0c09ad1dc3026550ba1db8985e2
  Compiled from "SelectorThread.java"
public final class ext.mods.commons.mmocore.SelectorThread<T extends ext.mods.commons.mmocore.MMOClient<?>> extends java.lang.Thread
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #26                         // ext/mods/commons/mmocore/SelectorThread
  super_class: #2                         // java/lang/Thread
  interfaces: 0, fields: 20, methods: 20, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Thread."<init>":()V
    #2 = Class              #4            // java/lang/Thread
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Thread
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #2.#8         // java/lang/Thread.threadId:()J
    #8 = NameAndType        #9:#10        // threadId:()J
    #9 = Utf8               threadId
   #10 = Utf8               ()J
   #11 = InvokeDynamic      #0:#12        // #0:makeConcatWithConstants:(J)Ljava/lang/String;
   #12 = NameAndType        #13:#14       // makeConcatWithConstants:(J)Ljava/lang/String;
   #13 = Utf8               makeConcatWithConstants
   #14 = Utf8               (J)Ljava/lang/String;
   #15 = Methodref          #2.#16        // java/lang/Thread.setName:(Ljava/lang/String;)V
   #16 = NameAndType        #17:#18       // setName:(Ljava/lang/String;)V
   #17 = Utf8               setName
   #18 = Utf8               (Ljava/lang/String;)V
   #19 = Fieldref           #20.#21       // ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_SIZE:I
   #20 = Class              #22           // ext/mods/commons/mmocore/SelectorConfig
   #21 = NameAndType        #23:#24       // HELPER_BUFFER_SIZE:I
   #22 = Utf8               ext/mods/commons/mmocore/SelectorConfig
   #23 = Utf8               HELPER_BUFFER_SIZE
   #24 = Utf8               I
   #25 = Fieldref           #26.#21       // ext/mods/commons/mmocore/SelectorThread.HELPER_BUFFER_SIZE:I
   #26 = Class              #27           // ext/mods/commons/mmocore/SelectorThread
   #27 = Utf8               ext/mods/commons/mmocore/SelectorThread
   #28 = Fieldref           #20.#29       // ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_COUNT:I
   #29 = NameAndType        #30:#24       // HELPER_BUFFER_COUNT:I
   #30 = Utf8               HELPER_BUFFER_COUNT
   #31 = Fieldref           #26.#29       // ext/mods/commons/mmocore/SelectorThread.HELPER_BUFFER_COUNT:I
   #32 = Fieldref           #20.#33       // ext/mods/commons/mmocore/SelectorConfig.MAX_SEND_PER_PASS:I
   #33 = NameAndType        #34:#24       // MAX_SEND_PER_PASS:I
   #34 = Utf8               MAX_SEND_PER_PASS
   #35 = Fieldref           #26.#33       // ext/mods/commons/mmocore/SelectorThread.MAX_SEND_PER_PASS:I
   #36 = Fieldref           #20.#37       // ext/mods/commons/mmocore/SelectorConfig.MAX_READ_PER_PASS:I
   #37 = NameAndType        #38:#24       // MAX_READ_PER_PASS:I
   #38 = Utf8               MAX_READ_PER_PASS
   #39 = Fieldref           #26.#37       // ext/mods/commons/mmocore/SelectorThread.MAX_READ_PER_PASS:I
   #40 = Fieldref           #20.#41       // ext/mods/commons/mmocore/SelectorConfig.SLEEP_TIME:I
   #41 = NameAndType        #42:#24       // SLEEP_TIME:I
   #42 = Utf8               SLEEP_TIME
   #43 = Fieldref           #26.#44       // ext/mods/commons/mmocore/SelectorThread.SLEEP_TIME:J
   #44 = NameAndType        #42:#45       // SLEEP_TIME:J
   #45 = Utf8               J
   #46 = Fieldref           #20.#47       // ext/mods/commons/mmocore/SelectorConfig.TCP_NODELAY:Z
   #47 = NameAndType        #48:#49       // TCP_NODELAY:Z
   #48 = Utf8               TCP_NODELAY
   #49 = Utf8               Z
   #50 = Fieldref           #26.#47       // ext/mods/commons/mmocore/SelectorThread.TCP_NODELAY:Z
   #51 = Fieldref           #20.#52       // ext/mods/commons/mmocore/SelectorConfig.WRITE_BUFFER_SIZE:I
   #52 = NameAndType        #53:#24       // WRITE_BUFFER_SIZE:I
   #53 = Utf8               WRITE_BUFFER_SIZE
   #54 = Methodref          #55.#56       // java/nio/ByteBuffer.allocateDirect:(I)Ljava/nio/ByteBuffer;
   #55 = Class              #57           // java/nio/ByteBuffer
   #56 = NameAndType        #58:#59       // allocateDirect:(I)Ljava/nio/ByteBuffer;
   #57 = Utf8               java/nio/ByteBuffer
   #58 = Utf8               allocateDirect
   #59 = Utf8               (I)Ljava/nio/ByteBuffer;
   #60 = Fieldref           #26.#61       // ext/mods/commons/mmocore/SelectorThread.BYTE_ORDER:Ljava/nio/ByteOrder;
   #61 = NameAndType        #62:#63       // BYTE_ORDER:Ljava/nio/ByteOrder;
   #62 = Utf8               BYTE_ORDER
   #63 = Utf8               Ljava/nio/ByteOrder;
   #64 = Methodref          #55.#65       // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #65 = NameAndType        #66:#67       // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #66 = Utf8               order
   #67 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #68 = Fieldref           #26.#69       // ext/mods/commons/mmocore/SelectorThread.DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
   #69 = NameAndType        #70:#71       // DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
   #70 = Utf8               DIRECT_WRITE_BUFFER
   #71 = Utf8               Ljava/nio/ByteBuffer;
   #72 = Methodref          #55.#73       // java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
   #73 = NameAndType        #74:#75       // wrap:([B)Ljava/nio/ByteBuffer;
   #74 = Utf8               wrap
   #75 = Utf8               ([B)Ljava/nio/ByteBuffer;
   #76 = Fieldref           #26.#77       // ext/mods/commons/mmocore/SelectorThread.WRITE_BUFFER:Ljava/nio/ByteBuffer;
   #77 = NameAndType        #78:#71       // WRITE_BUFFER:Ljava/nio/ByteBuffer;
   #78 = Utf8               WRITE_BUFFER
   #79 = Fieldref           #20.#80       // ext/mods/commons/mmocore/SelectorConfig.READ_BUFFER_SIZE:I
   #80 = NameAndType        #81:#24       // READ_BUFFER_SIZE:I
   #81 = Utf8               READ_BUFFER_SIZE
   #82 = Fieldref           #26.#83       // ext/mods/commons/mmocore/SelectorThread.READ_BUFFER:Ljava/nio/ByteBuffer;
   #83 = NameAndType        #84:#71       // READ_BUFFER:Ljava/nio/ByteBuffer;
   #84 = Utf8               READ_BUFFER
   #85 = Class              #86           // ext/mods/commons/mmocore/NioNetStringBuffer
   #86 = Utf8               ext/mods/commons/mmocore/NioNetStringBuffer
   #87 = Integer            65536
   #88 = Methodref          #85.#89       // ext/mods/commons/mmocore/NioNetStringBuffer."<init>":(I)V
   #89 = NameAndType        #5:#90        // "<init>":(I)V
   #90 = Utf8               (I)V
   #91 = Fieldref           #26.#92       // ext/mods/commons/mmocore/SelectorThread.STRING_BUFFER:Lext/mods/commons/mmocore/NioNetStringBuffer;
   #92 = NameAndType        #93:#94       // STRING_BUFFER:Lext/mods/commons/mmocore/NioNetStringBuffer;
   #93 = Utf8               STRING_BUFFER
   #94 = Utf8               Lext/mods/commons/mmocore/NioNetStringBuffer;
   #95 = Class              #96           // ext/mods/commons/mmocore/NioNetStackList
   #96 = Utf8               ext/mods/commons/mmocore/NioNetStackList
   #97 = Methodref          #95.#3        // ext/mods/commons/mmocore/NioNetStackList."<init>":()V
   #98 = Fieldref           #26.#99       // ext/mods/commons/mmocore/SelectorThread._pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
   #99 = NameAndType        #100:#101     // _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
  #100 = Utf8               _pendingClose
  #101 = Utf8               Lext/mods/commons/mmocore/NioNetStackList;
  #102 = Class              #103          // java/util/LinkedList
  #103 = Utf8               java/util/LinkedList
  #104 = Methodref          #102.#3       // java/util/LinkedList."<init>":()V
  #105 = Fieldref           #26.#106      // ext/mods/commons/mmocore/SelectorThread._bufferPool:Ljava/util/LinkedList;
  #106 = NameAndType        #107:#108     // _bufferPool:Ljava/util/LinkedList;
  #107 = Utf8               _bufferPool
  #108 = Utf8               Ljava/util/LinkedList;
  #109 = Methodref          #102.#110     // java/util/LinkedList.addLast:(Ljava/lang/Object;)V
  #110 = NameAndType        #111:#112     // addLast:(Ljava/lang/Object;)V
  #111 = Utf8               addLast
  #112 = Utf8               (Ljava/lang/Object;)V
  #113 = Fieldref           #26.#114      // ext/mods/commons/mmocore/SelectorThread._acceptFilter:Lext/mods/commons/mmocore/IAcceptFilter;
  #114 = NameAndType        #115:#116     // _acceptFilter:Lext/mods/commons/mmocore/IAcceptFilter;
  #115 = Utf8               _acceptFilter
  #116 = Utf8               Lext/mods/commons/mmocore/IAcceptFilter;
  #117 = Fieldref           #26.#118      // ext/mods/commons/mmocore/SelectorThread._packetHandler:Lext/mods/commons/mmocore/IPacketHandler;
  #118 = NameAndType        #119:#120     // _packetHandler:Lext/mods/commons/mmocore/IPacketHandler;
  #119 = Utf8               _packetHandler
  #120 = Utf8               Lext/mods/commons/mmocore/IPacketHandler;
  #121 = Fieldref           #26.#122      // ext/mods/commons/mmocore/SelectorThread._clientFactory:Lext/mods/commons/mmocore/IClientFactory;
  #122 = NameAndType        #123:#124     // _clientFactory:Lext/mods/commons/mmocore/IClientFactory;
  #123 = Utf8               _clientFactory
  #124 = Utf8               Lext/mods/commons/mmocore/IClientFactory;
  #125 = Fieldref           #26.#126      // ext/mods/commons/mmocore/SelectorThread._executor:Lext/mods/commons/mmocore/IMMOExecutor;
  #126 = NameAndType        #127:#128     // _executor:Lext/mods/commons/mmocore/IMMOExecutor;
  #127 = Utf8               _executor
  #128 = Utf8               Lext/mods/commons/mmocore/IMMOExecutor;
  #129 = Methodref          #130.#131     // java/nio/channels/Selector.open:()Ljava/nio/channels/Selector;
  #130 = Class              #132          // java/nio/channels/Selector
  #131 = NameAndType        #133:#134     // open:()Ljava/nio/channels/Selector;
  #132 = Utf8               java/nio/channels/Selector
  #133 = Utf8               open
  #134 = Utf8               ()Ljava/nio/channels/Selector;
  #135 = Fieldref           #26.#136      // ext/mods/commons/mmocore/SelectorThread._selector:Ljava/nio/channels/Selector;
  #136 = NameAndType        #137:#138     // _selector:Ljava/nio/channels/Selector;
  #137 = Utf8               _selector
  #138 = Utf8               Ljava/nio/channels/Selector;
  #139 = Methodref          #140.#141     // java/nio/channels/ServerSocketChannel.open:()Ljava/nio/channels/ServerSocketChannel;
  #140 = Class              #142          // java/nio/channels/ServerSocketChannel
  #141 = NameAndType        #133:#143     // open:()Ljava/nio/channels/ServerSocketChannel;
  #142 = Utf8               java/nio/channels/ServerSocketChannel
  #143 = Utf8               ()Ljava/nio/channels/ServerSocketChannel;
  #144 = Methodref          #140.#145     // java/nio/channels/ServerSocketChannel.configureBlocking:(Z)Ljava/nio/channels/SelectableChannel;
  #145 = NameAndType        #146:#147     // configureBlocking:(Z)Ljava/nio/channels/SelectableChannel;
  #146 = Utf8               configureBlocking
  #147 = Utf8               (Z)Ljava/nio/channels/SelectableChannel;
  #148 = Methodref          #140.#149     // java/nio/channels/ServerSocketChannel.socket:()Ljava/net/ServerSocket;
  #149 = NameAndType        #150:#151     // socket:()Ljava/net/ServerSocket;
  #150 = Utf8               socket
  #151 = Utf8               ()Ljava/net/ServerSocket;
  #152 = Class              #153          // java/net/InetSocketAddress
  #153 = Utf8               java/net/InetSocketAddress
  #154 = Methodref          #152.#89      // java/net/InetSocketAddress."<init>":(I)V
  #155 = Methodref          #152.#156     // java/net/InetSocketAddress."<init>":(Ljava/net/InetAddress;I)V
  #156 = NameAndType        #5:#157       // "<init>":(Ljava/net/InetAddress;I)V
  #157 = Utf8               (Ljava/net/InetAddress;I)V
  #158 = Methodref          #159.#160     // java/net/ServerSocket.bind:(Ljava/net/SocketAddress;)V
  #159 = Class              #161          // java/net/ServerSocket
  #160 = NameAndType        #162:#163     // bind:(Ljava/net/SocketAddress;)V
  #161 = Utf8               java/net/ServerSocket
  #162 = Utf8               bind
  #163 = Utf8               (Ljava/net/SocketAddress;)V
  #164 = Class              #165          // java/nio/channels/SelectionKey
  #165 = Utf8               java/nio/channels/SelectionKey
  #166 = Methodref          #140.#167     // java/nio/channels/ServerSocketChannel.register:(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
  #167 = NameAndType        #168:#169     // register:(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
  #168 = Utf8               register
  #169 = Utf8               (Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
  #170 = Methodref          #102.#171     // java/util/LinkedList.isEmpty:()Z
  #171 = NameAndType        #172:#173     // isEmpty:()Z
  #172 = Utf8               isEmpty
  #173 = Utf8               ()Z
  #174 = Methodref          #102.#175     // java/util/LinkedList.removeFirst:()Ljava/lang/Object;
  #175 = NameAndType        #176:#177     // removeFirst:()Ljava/lang/Object;
  #176 = Utf8               removeFirst
  #177 = Utf8               ()Ljava/lang/Object;
  #178 = Methodref          #102.#179     // java/util/LinkedList.size:()I
  #179 = NameAndType        #180:#181     // size:()I
  #180 = Utf8               size
  #181 = Utf8               ()I
  #182 = Methodref          #55.#183      // java/nio/ByteBuffer.clear:()Ljava/nio/ByteBuffer;
  #183 = NameAndType        #184:#185     // clear:()Ljava/nio/ByteBuffer;
  #184 = Utf8               clear
  #185 = Utf8               ()Ljava/nio/ByteBuffer;
  #186 = Fieldref           #26.#187      // ext/mods/commons/mmocore/SelectorThread._shutdown:Z
  #187 = NameAndType        #188:#49      // _shutdown:Z
  #188 = Utf8               _shutdown
  #189 = Methodref          #130.#190     // java/nio/channels/Selector.selectNow:()I
  #190 = NameAndType        #191:#181     // selectNow:()I
  #191 = Utf8               selectNow
  #192 = Class              #193          // java/io/IOException
  #193 = Utf8               java/io/IOException
  #194 = Methodref          #192.#195     // java/io/IOException.printStackTrace:()V
  #195 = NameAndType        #196:#6       // printStackTrace:()V
  #196 = Utf8               printStackTrace
  #197 = Methodref          #130.#198     // java/nio/channels/Selector.selectedKeys:()Ljava/util/Set;
  #198 = NameAndType        #199:#200     // selectedKeys:()Ljava/util/Set;
  #199 = Utf8               selectedKeys
  #200 = Utf8               ()Ljava/util/Set;
  #201 = InterfaceMethodref #202.#203     // java/util/Set.iterator:()Ljava/util/Iterator;
  #202 = Class              #204          // java/util/Set
  #203 = NameAndType        #205:#206     // iterator:()Ljava/util/Iterator;
  #204 = Utf8               java/util/Set
  #205 = Utf8               iterator
  #206 = Utf8               ()Ljava/util/Iterator;
  #207 = InterfaceMethodref #208.#209     // java/util/Iterator.hasNext:()Z
  #208 = Class              #210          // java/util/Iterator
  #209 = NameAndType        #211:#173     // hasNext:()Z
  #210 = Utf8               java/util/Iterator
  #211 = Utf8               hasNext
  #212 = InterfaceMethodref #208.#213     // java/util/Iterator.next:()Ljava/lang/Object;
  #213 = NameAndType        #214:#177     // next:()Ljava/lang/Object;
  #214 = Utf8               next
  #215 = InterfaceMethodref #208.#216     // java/util/Iterator.remove:()V
  #216 = NameAndType        #217:#6       // remove:()V
  #217 = Utf8               remove
  #218 = Methodref          #164.#219     // java/nio/channels/SelectionKey.attachment:()Ljava/lang/Object;
  #219 = NameAndType        #220:#177     // attachment:()Ljava/lang/Object;
  #220 = Utf8               attachment
  #221 = Class              #222          // ext/mods/commons/mmocore/MMOConnection
  #222 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #223 = Methodref          #164.#224     // java/nio/channels/SelectionKey.readyOps:()I
  #224 = NameAndType        #225:#181     // readyOps:()I
  #225 = Utf8               readyOps
  #226 = Methodref          #26.#227      // ext/mods/commons/mmocore/SelectorThread.finishConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #227 = NameAndType        #228:#229     // finishConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #228 = Utf8               finishConnection
  #229 = Utf8               (Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #230 = Methodref          #26.#231      // ext/mods/commons/mmocore/SelectorThread.acceptConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #231 = NameAndType        #232:#229     // acceptConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #232 = Utf8               acceptConnection
  #233 = Methodref          #26.#234      // ext/mods/commons/mmocore/SelectorThread.readPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #234 = NameAndType        #235:#229     // readPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #235 = Utf8               readPacket
  #236 = Methodref          #26.#237      // ext/mods/commons/mmocore/SelectorThread.writePacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #237 = NameAndType        #238:#229     // writePacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #238 = Utf8               writePacket
  #239 = Methodref          #164.#240     // java/nio/channels/SelectionKey.isValid:()Z
  #240 = NameAndType        #241:#173     // isValid:()Z
  #241 = Utf8               isValid
  #242 = Methodref          #95.#171      // ext/mods/commons/mmocore/NioNetStackList.isEmpty:()Z
  #243 = Methodref          #95.#175      // ext/mods/commons/mmocore/NioNetStackList.removeFirst:()Ljava/lang/Object;
  #244 = Methodref          #26.#245      // ext/mods/commons/mmocore/SelectorThread.writeClosePacket:(Lext/mods/commons/mmocore/MMOConnection;)V
  #245 = NameAndType        #246:#247     // writeClosePacket:(Lext/mods/commons/mmocore/MMOConnection;)V
  #246 = Utf8               writeClosePacket
  #247 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)V
  #248 = Methodref          #221.#249     // ext/mods/commons/mmocore/MMOConnection.getSelectionKey:()Ljava/nio/channels/SelectionKey;
  #249 = NameAndType        #250:#251     // getSelectionKey:()Ljava/nio/channels/SelectionKey;
  #250 = Utf8               getSelectionKey
  #251 = Utf8               ()Ljava/nio/channels/SelectionKey;
  #252 = Methodref          #26.#253      // ext/mods/commons/mmocore/SelectorThread.closeConnectionImpl:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #253 = NameAndType        #254:#229     // closeConnectionImpl:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
  #254 = Utf8               closeConnectionImpl
  #255 = Class              #256          // java/lang/Exception
  #256 = Utf8               java/lang/Exception
  #257 = Methodref          #255.#195     // java/lang/Exception.printStackTrace:()V
  #258 = Methodref          #2.#259       // java/lang/Thread.sleep:(J)V
  #259 = NameAndType        #260:#261     // sleep:(J)V
  #260 = Utf8               sleep
  #261 = Utf8               (J)V
  #262 = Class              #263          // java/lang/InterruptedException
  #263 = Utf8               java/lang/InterruptedException
  #264 = Methodref          #262.#195     // java/lang/InterruptedException.printStackTrace:()V
  #265 = Methodref          #26.#266      // ext/mods/commons/mmocore/SelectorThread.closeSelectorThread:()V
  #266 = NameAndType        #267:#6       // closeSelectorThread:()V
  #267 = Utf8               closeSelectorThread
  #268 = Methodref          #164.#269     // java/nio/channels/SelectionKey.channel:()Ljava/nio/channels/SelectableChannel;
  #269 = NameAndType        #270:#271     // channel:()Ljava/nio/channels/SelectableChannel;
  #270 = Utf8               channel
  #271 = Utf8               ()Ljava/nio/channels/SelectableChannel;
  #272 = Class              #273          // java/nio/channels/SocketChannel
  #273 = Utf8               java/nio/channels/SocketChannel
  #274 = Methodref          #272.#275     // java/nio/channels/SocketChannel.finishConnect:()Z
  #275 = NameAndType        #276:#173     // finishConnect:()Z
  #276 = Utf8               finishConnect
  #277 = Methodref          #221.#278     // ext/mods/commons/mmocore/MMOConnection.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #278 = NameAndType        #279:#280     // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #279 = Utf8               getClient
  #280 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #281 = Methodref          #282.#283     // ext/mods/commons/mmocore/MMOClient.onForcedDisconnection:()V
  #282 = Class              #284          // ext/mods/commons/mmocore/MMOClient
  #283 = NameAndType        #285:#6       // onForcedDisconnection:()V
  #284 = Utf8               ext/mods/commons/mmocore/MMOClient
  #285 = Utf8               onForcedDisconnection
  #286 = Methodref          #164.#287     // java/nio/channels/SelectionKey.interestOps:()I
  #287 = NameAndType        #288:#181     // interestOps:()I
  #288 = Utf8               interestOps
  #289 = Methodref          #164.#290     // java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
  #290 = NameAndType        #288:#291     // interestOps:(I)Ljava/nio/channels/SelectionKey;
  #291 = Utf8               (I)Ljava/nio/channels/SelectionKey;
  #292 = Methodref          #140.#293     // java/nio/channels/ServerSocketChannel.accept:()Ljava/nio/channels/SocketChannel;
  #293 = NameAndType        #294:#295     // accept:()Ljava/nio/channels/SocketChannel;
  #294 = Utf8               accept
  #295 = Utf8               ()Ljava/nio/channels/SocketChannel;
  #296 = Methodref          #272.#297     // java/nio/channels/SocketChannel.socket:()Ljava/net/Socket;
  #297 = NameAndType        #150:#298     // socket:()Ljava/net/Socket;
  #298 = Utf8               ()Ljava/net/Socket;
  #299 = InterfaceMethodref #300.#301     // ext/mods/commons/mmocore/IAcceptFilter.accept:(Ljava/net/Socket;)Z
  #300 = Class              #302          // ext/mods/commons/mmocore/IAcceptFilter
  #301 = NameAndType        #294:#303     // accept:(Ljava/net/Socket;)Z
  #302 = Utf8               ext/mods/commons/mmocore/IAcceptFilter
  #303 = Utf8               (Ljava/net/Socket;)Z
  #304 = Methodref          #272.#145     // java/nio/channels/SocketChannel.configureBlocking:(Z)Ljava/nio/channels/SelectableChannel;
  #305 = Methodref          #272.#167     // java/nio/channels/SocketChannel.register:(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
  #306 = Methodref          #221.#307     // ext/mods/commons/mmocore/MMOConnection."<init>":(Lext/mods/commons/mmocore/SelectorThread;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
  #307 = NameAndType        #5:#308       // "<init>":(Lext/mods/commons/mmocore/SelectorThread;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
  #308 = Utf8               (Lext/mods/commons/mmocore/SelectorThread;Ljava/net/Socket;Ljava/nio/channels/SelectionKey;Z)V
  #309 = InterfaceMethodref #310.#311     // ext/mods/commons/mmocore/IClientFactory.create:(Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
  #310 = Class              #312          // ext/mods/commons/mmocore/IClientFactory
  #311 = NameAndType        #313:#314     // create:(Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
  #312 = Utf8               ext/mods/commons/mmocore/IClientFactory
  #313 = Utf8               create
  #314 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
  #315 = Methodref          #221.#316     // ext/mods/commons/mmocore/MMOConnection.setClient:(Lext/mods/commons/mmocore/MMOClient;)V
  #316 = NameAndType        #317:#318     // setClient:(Lext/mods/commons/mmocore/MMOClient;)V
  #317 = Utf8               setClient
  #318 = Utf8               (Lext/mods/commons/mmocore/MMOClient;)V
  #319 = Methodref          #164.#320     // java/nio/channels/SelectionKey.attach:(Ljava/lang/Object;)Ljava/lang/Object;
  #320 = NameAndType        #321:#322     // attach:(Ljava/lang/Object;)Ljava/lang/Object;
  #321 = Utf8               attach
  #322 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #323 = Methodref          #324.#325     // java/net/Socket.close:()V
  #324 = Class              #326          // java/net/Socket
  #325 = NameAndType        #327:#6       // close:()V
  #326 = Utf8               java/net/Socket
  #327 = Utf8               close
  #328 = Methodref          #221.#329     // ext/mods/commons/mmocore/MMOConnection.isClosed:()Z
  #329 = NameAndType        #330:#173     // isClosed:()Z
  #330 = Utf8               isClosed
  #331 = Methodref          #221.#332     // ext/mods/commons/mmocore/MMOConnection.getReadBuffer:()Ljava/nio/ByteBuffer;
  #332 = NameAndType        #333:#185     // getReadBuffer:()Ljava/nio/ByteBuffer;
  #333 = Utf8               getReadBuffer
  #334 = Methodref          #55.#335      // java/nio/ByteBuffer.position:()I
  #335 = NameAndType        #336:#181     // position:()I
  #336 = Utf8               position
  #337 = Methodref          #55.#338      // java/nio/ByteBuffer.limit:()I
  #338 = NameAndType        #339:#181     // limit:()I
  #339 = Utf8               limit
  #340 = Methodref          #221.#341     // ext/mods/commons/mmocore/MMOConnection.read:(Ljava/nio/ByteBuffer;)I
  #341 = NameAndType        #342:#343     // read:(Ljava/nio/ByteBuffer;)I
  #342 = Utf8               read
  #343 = Utf8               (Ljava/nio/ByteBuffer;)I
  #344 = Methodref          #55.#345      // java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
  #345 = NameAndType        #346:#185     // flip:()Ljava/nio/ByteBuffer;
  #346 = Utf8               flip
  #347 = Methodref          #26.#348      // ext/mods/commons/mmocore/SelectorThread.tryReadPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOClient;Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOConnection;)Z
  #348 = NameAndType        #349:#350     // tryReadPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOClient;Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOConnection;)Z
  #349 = Utf8               tryReadPacket
  #350 = Utf8               (Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOClient;Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOConnection;)Z
  #351 = Methodref          #55.#352      // java/nio/ByteBuffer.remaining:()I
  #352 = NameAndType        #353:#181     // remaining:()I
  #353 = Utf8               remaining
  #354 = Methodref          #26.#355      // ext/mods/commons/mmocore/SelectorThread.allocateReadBuffer:(Lext/mods/commons/mmocore/MMOConnection;)V
  #355 = NameAndType        #356:#247     // allocateReadBuffer:(Lext/mods/commons/mmocore/MMOConnection;)V
  #356 = Utf8               allocateReadBuffer
  #357 = Methodref          #55.#358      // java/nio/ByteBuffer.compact:()Ljava/nio/ByteBuffer;
  #358 = NameAndType        #359:#185     // compact:()Ljava/nio/ByteBuffer;
  #359 = Utf8               compact
  #360 = Methodref          #55.#361      // java/nio/ByteBuffer.getShort:()S
  #361 = NameAndType        #362:#363     // getShort:()S
  #362 = Utf8               getShort
  #363 = Utf8               ()S
  #364 = Integer            65535
  #365 = Methodref          #26.#366      // ext/mods/commons/mmocore/SelectorThread.parseClientPacket:(ILjava/nio/ByteBuffer;ILext/mods/commons/mmocore/MMOClient;)V
  #366 = NameAndType        #367:#368     // parseClientPacket:(ILjava/nio/ByteBuffer;ILext/mods/commons/mmocore/MMOClient;)V
  #367 = Utf8               parseClientPacket
  #368 = Utf8               (ILjava/nio/ByteBuffer;ILext/mods/commons/mmocore/MMOClient;)V
  #369 = Methodref          #55.#370      // java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
  #370 = NameAndType        #336:#59      // position:(I)Ljava/nio/ByteBuffer;
  #371 = Methodref          #55.#372      // java/nio/ByteBuffer.hasRemaining:()Z
  #372 = NameAndType        #373:#173     // hasRemaining:()Z
  #373 = Utf8               hasRemaining
  #374 = Methodref          #221.#375     // ext/mods/commons/mmocore/MMOConnection.setReadBuffer:(Ljava/nio/ByteBuffer;)V
  #375 = NameAndType        #376:#377     // setReadBuffer:(Ljava/nio/ByteBuffer;)V
  #376 = Utf8               setReadBuffer
  #377 = Utf8               (Ljava/nio/ByteBuffer;)V
  #378 = Methodref          #26.#379      // ext/mods/commons/mmocore/SelectorThread.recycleBuffer:(Ljava/nio/ByteBuffer;)V
  #379 = NameAndType        #380:#377     // recycleBuffer:(Ljava/nio/ByteBuffer;)V
  #380 = Utf8               recycleBuffer
  #381 = Methodref          #26.#382      // ext/mods/commons/mmocore/SelectorThread.getPooledBuffer:()Ljava/nio/ByteBuffer;
  #382 = NameAndType        #383:#185     // getPooledBuffer:()Ljava/nio/ByteBuffer;
  #383 = Utf8               getPooledBuffer
  #384 = Methodref          #55.#385      // java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #385 = NameAndType        #386:#387     // put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #386 = Utf8               put
  #387 = Utf8               (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
  #388 = Methodref          #282.#389     // ext/mods/commons/mmocore/MMOClient.decrypt:(Ljava/nio/ByteBuffer;I)Z
  #389 = NameAndType        #390:#391     // decrypt:(Ljava/nio/ByteBuffer;I)Z
  #390 = Utf8               decrypt
  #391 = Utf8               (Ljava/nio/ByteBuffer;I)Z
  #392 = Methodref          #55.#393      // java/nio/ByteBuffer.limit:(I)Ljava/nio/ByteBuffer;
  #393 = NameAndType        #339:#59      // limit:(I)Ljava/nio/ByteBuffer;
  #394 = InterfaceMethodref #395.#396     // ext/mods/commons/mmocore/IPacketHandler.handlePacket:(Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #395 = Class              #397          // ext/mods/commons/mmocore/IPacketHandler
  #396 = NameAndType        #398:#399     // handlePacket:(Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #397 = Utf8               ext/mods/commons/mmocore/IPacketHandler
  #398 = Utf8               handlePacket
  #399 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #400 = Fieldref           #401.#402     // ext/mods/commons/mmocore/ReceivablePacket._buf:Ljava/nio/ByteBuffer;
  #401 = Class              #403          // ext/mods/commons/mmocore/ReceivablePacket
  #402 = NameAndType        #404:#71      // _buf:Ljava/nio/ByteBuffer;
  #403 = Utf8               ext/mods/commons/mmocore/ReceivablePacket
  #404 = Utf8               _buf
  #405 = Fieldref           #401.#406     // ext/mods/commons/mmocore/ReceivablePacket._sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
  #406 = NameAndType        #407:#94      // _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
  #407 = Utf8               _sbuf
  #408 = Fieldref           #401.#409     // ext/mods/commons/mmocore/ReceivablePacket._client:Lext/mods/commons/mmocore/MMOClient;
  #409 = NameAndType        #410:#411     // _client:Lext/mods/commons/mmocore/MMOClient;
  #410 = Utf8               _client
  #411 = Utf8               Lext/mods/commons/mmocore/MMOClient;
  #412 = Methodref          #401.#413     // ext/mods/commons/mmocore/ReceivablePacket.read:()Z
  #413 = NameAndType        #342:#173     // read:()Z
  #414 = InterfaceMethodref #415.#416     // ext/mods/commons/mmocore/IMMOExecutor.execute:(Lext/mods/commons/mmocore/ReceivablePacket;)V
  #415 = Class              #417          // ext/mods/commons/mmocore/IMMOExecutor
  #416 = NameAndType        #418:#419     // execute:(Lext/mods/commons/mmocore/ReceivablePacket;)V
  #417 = Utf8               ext/mods/commons/mmocore/IMMOExecutor
  #418 = Utf8               execute
  #419 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket;)V
  #420 = Methodref          #221.#421     // ext/mods/commons/mmocore/MMOConnection.getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
  #421 = NameAndType        #422:#423     // getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
  #422 = Utf8               getSendQueue
  #423 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList;
  #424 = Class              #425          // ext/mods/commons/mmocore/SendablePacket
  #425 = Utf8               ext/mods/commons/mmocore/SendablePacket
  #426 = Methodref          #26.#427      // ext/mods/commons/mmocore/SelectorThread.putPacketIntoWriteBuffer:(Lext/mods/commons/mmocore/MMOClient;Lext/mods/commons/mmocore/SendablePacket;)V
  #427 = NameAndType        #428:#429     // putPacketIntoWriteBuffer:(Lext/mods/commons/mmocore/MMOClient;Lext/mods/commons/mmocore/SendablePacket;)V
  #428 = Utf8               putPacketIntoWriteBuffer
  #429 = Utf8               (Lext/mods/commons/mmocore/MMOClient;Lext/mods/commons/mmocore/SendablePacket;)V
  #430 = Methodref          #221.#431     // ext/mods/commons/mmocore/MMOConnection.write:(Ljava/nio/ByteBuffer;)I
  #431 = NameAndType        #432:#343     // write:(Ljava/nio/ByteBuffer;)I
  #432 = Utf8               write
  #433 = Methodref          #26.#434      // ext/mods/commons/mmocore/SelectorThread.prepareWriteBuffer:(Lext/mods/commons/mmocore/MMOConnection;)Z
  #434 = NameAndType        #435:#436     // prepareWriteBuffer:(Lext/mods/commons/mmocore/MMOConnection;)Z
  #435 = Utf8               prepareWriteBuffer
  #436 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)Z
  #437 = Methodref          #221.#438     // ext/mods/commons/mmocore/MMOConnection.hasPendingWriteBuffer:()Z
  #438 = NameAndType        #439:#173     // hasPendingWriteBuffer:()Z
  #439 = Utf8               hasPendingWriteBuffer
  #440 = Methodref          #221.#441     // ext/mods/commons/mmocore/MMOConnection.createWriteBuffer:(Ljava/nio/ByteBuffer;)V
  #441 = NameAndType        #442:#377     // createWriteBuffer:(Ljava/nio/ByteBuffer;)V
  #442 = Utf8               createWriteBuffer
  #443 = Methodref          #221.#444     // ext/mods/commons/mmocore/MMOConnection.movePendingWriteBufferTo:(Ljava/nio/ByteBuffer;)V
  #444 = NameAndType        #445:#377     // movePendingWriteBufferTo:(Ljava/nio/ByteBuffer;)V
  #445 = Utf8               movePendingWriteBufferTo
  #446 = Fieldref           #424.#402     // ext/mods/commons/mmocore/SendablePacket._buf:Ljava/nio/ByteBuffer;
  #447 = Fieldref           #424.#409     // ext/mods/commons/mmocore/SendablePacket._client:Lext/mods/commons/mmocore/MMOClient;
  #448 = Methodref          #424.#449     // ext/mods/commons/mmocore/SendablePacket.write:()V
  #449 = NameAndType        #432:#6       // write:()V
  #450 = Methodref          #282.#451     // ext/mods/commons/mmocore/MMOClient.encrypt:(Ljava/nio/ByteBuffer;I)Z
  #451 = NameAndType        #452:#391     // encrypt:(Ljava/nio/ByteBuffer;I)Z
  #452 = Utf8               encrypt
  #453 = Methodref          #55.#454      // java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
  #454 = NameAndType        #455:#456     // putShort:(S)Ljava/nio/ByteBuffer;
  #455 = Utf8               putShort
  #456 = Utf8               (S)Ljava/nio/ByteBuffer;
  #457 = Methodref          #95.#110      // ext/mods/commons/mmocore/NioNetStackList.addLast:(Ljava/lang/Object;)V
  #458 = Methodref          #282.#459     // ext/mods/commons/mmocore/MMOClient.onDisconnection:()V
  #459 = NameAndType        #460:#6       // onDisconnection:()V
  #460 = Utf8               onDisconnection
  #461 = Methodref          #221.#325     // ext/mods/commons/mmocore/MMOConnection.close:()V
  #462 = Methodref          #221.#463     // ext/mods/commons/mmocore/MMOConnection.releaseBuffers:()V
  #463 = NameAndType        #464:#6       // releaseBuffers:()V
  #464 = Utf8               releaseBuffers
  #465 = Methodref          #164.#466     // java/nio/channels/SelectionKey.cancel:()V
  #466 = NameAndType        #467:#6       // cancel:()V
  #467 = Utf8               cancel
  #468 = Methodref          #130.#469     // java/nio/channels/Selector.keys:()Ljava/util/Set;
  #469 = NameAndType        #470:#200     // keys:()Ljava/util/Set;
  #470 = Utf8               keys
  #471 = Methodref          #472.#325     // java/nio/channels/SelectableChannel.close:()V
  #472 = Class              #473          // java/nio/channels/SelectableChannel
  #473 = Utf8               java/nio/channels/SelectableChannel
  #474 = Methodref          #130.#325     // java/nio/channels/Selector.close:()V
  #475 = Fieldref           #476.#477     // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #476 = Class              #478          // java/nio/ByteOrder
  #477 = NameAndType        #479:#63      // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #478 = Utf8               java/nio/ByteOrder
  #479 = Utf8               LITTLE_ENDIAN
  #480 = Utf8               HEADER_SIZE
  #481 = Utf8               ConstantValue
  #482 = Integer            2
  #483 = Utf8               Signature
  #484 = Utf8               Lext/mods/commons/mmocore/IPacketHandler<TT;>;
  #485 = Utf8               Lext/mods/commons/mmocore/IMMOExecutor<TT;>;
  #486 = Utf8               Lext/mods/commons/mmocore/IClientFactory<TT;>;
  #487 = Utf8               Ljava/util/LinkedList<Ljava/nio/ByteBuffer;>;
  #488 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<Lext/mods/commons/mmocore/MMOConnection<TT;>;>;
  #489 = Utf8               (Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor;Lext/mods/commons/mmocore/IPacketHandler;Lext/mods/commons/mmocore/IClientFactory;Lext/mods/commons/mmocore/IAcceptFilter;)V
  #490 = Utf8               Code
  #491 = Utf8               LineNumberTable
  #492 = Utf8               LocalVariableTable
  #493 = Utf8               i
  #494 = Utf8               this
  #495 = Utf8               Lext/mods/commons/mmocore/SelectorThread;
  #496 = Utf8               sc
  #497 = Utf8               Lext/mods/commons/mmocore/SelectorConfig;
  #498 = Utf8               executor
  #499 = Utf8               packetHandler
  #500 = Utf8               clientFactory
  #501 = Utf8               acceptFilter
  #502 = Utf8               LocalVariableTypeTable
  #503 = Utf8               Lext/mods/commons/mmocore/SelectorThread<TT;>;
  #504 = Utf8               StackMapTable
  #505 = Utf8               Exceptions
  #506 = Utf8               (Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor<TT;>;Lext/mods/commons/mmocore/IPacketHandler<TT;>;Lext/mods/commons/mmocore/IClientFactory<TT;>;Lext/mods/commons/mmocore/IAcceptFilter;)V
  #507 = Utf8               openServerSocket
  #508 = Utf8               address
  #509 = Utf8               Ljava/net/InetAddress;
  #510 = Utf8               tcpPort
  #511 = Utf8               selectable
  #512 = Utf8               Ljava/nio/channels/ServerSocketChannel;
  #513 = Class              #514          // java/net/InetAddress
  #514 = Utf8               java/net/InetAddress
  #515 = Utf8               buf
  #516 = Utf8               run
  #517 = Utf8               e
  #518 = Utf8               Ljava/io/IOException;
  #519 = Utf8               key
  #520 = Utf8               Ljava/nio/channels/SelectionKey;
  #521 = Utf8               con
  #522 = Utf8               Lext/mods/commons/mmocore/MMOConnection;
  #523 = Utf8               Ljava/util/Iterator;
  #524 = Utf8               Ljava/lang/Exception;
  #525 = Utf8               Ljava/lang/InterruptedException;
  #526 = Utf8               selectedKeysCount
  #527 = Utf8               Lext/mods/commons/mmocore/MMOConnection<TT;>;
  #528 = Utf8               Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;
  #529 = Class              #530          // java/lang/Object
  #530 = Utf8               java/lang/Object
  #531 = Class              #532          // java/lang/Throwable
  #532 = Utf8               java/lang/Throwable
  #533 = Utf8               (Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection<TT;>;)V
  #534 = Utf8               clientKey
  #535 = Utf8               Ljava/net/Socket;
  #536 = Utf8               Ljava/nio/channels/SocketChannel;
  #537 = Utf8               ssc
  #538 = Utf8               client
  #539 = Utf8               result
  #540 = Utf8               TT;
  #541 = Utf8               pos
  #542 = Utf8               dataPending
  #543 = Utf8               (Ljava/nio/channels/SelectionKey;TT;Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOConnection<TT;>;)Z
  #544 = Utf8               (Lext/mods/commons/mmocore/MMOConnection<TT;>;)V
  #545 = Utf8               cp
  #546 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket;
  #547 = Utf8               dataSize
  #548 = Utf8               ret
  #549 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
  #550 = Utf8               (ILjava/nio/ByteBuffer;ITT;)V
  #551 = Utf8               sp
  #552 = Utf8               Lext/mods/commons/mmocore/SendablePacket;
  #553 = Utf8               Lext/mods/commons/mmocore/SendablePacket<TT;>;
  #554 = Utf8               sendQueue
  #555 = Utf8               hasPending
  #556 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<Lext/mods/commons/mmocore/SendablePacket<TT;>;>;
  #557 = Utf8               (Lext/mods/commons/mmocore/MMOConnection<TT;>;)Z
  #558 = Utf8               headerPos
  #559 = Utf8               dataPos
  #560 = Utf8               (TT;Lext/mods/commons/mmocore/SendablePacket<TT;>;)V
  #561 = Utf8               closeConnection
  #562 = Utf8               shutdown
  #563 = Utf8               <clinit>
  #564 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Thread;
  #565 = Utf8               SourceFile
  #566 = Utf8               SelectorThread.java
  #567 = Utf8               BootstrapMethods
  #568 = String             #569          // SelectorThread-\u0001
  #569 = Utf8               SelectorThread-\u0001
  #570 = MethodHandle       6:#571        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #571 = Methodref          #572.#573     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #572 = Class              #574          // java/lang/invoke/StringConcatFactory
  #573 = NameAndType        #13:#575      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #574 = Utf8               java/lang/invoke/StringConcatFactory
  #575 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #576 = Utf8               InnerClasses
  #577 = Class              #578          // java/lang/invoke/MethodHandles$Lookup
  #578 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #579 = Class              #580          // java/lang/invoke/MethodHandles
  #580 = Utf8               java/lang/invoke/MethodHandles
  #581 = Utf8               Lookup
{
  public ext.mods.commons.mmocore.SelectorThread(ext.mods.commons.mmocore.SelectorConfig, ext.mods.commons.mmocore.IMMOExecutor<T>, ext.mods.commons.mmocore.IPacketHandler<T>, ext.mods.commons.mmocore.IClientFactory<T>, ext.mods.commons.mmocore.IAcceptFilter) throws java.io.IOException;
    descriptor: (Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor;Lext/mods/commons/mmocore/IPacketHandler;Lext/mods/commons/mmocore/IClientFactory;Lext/mods/commons/mmocore/IAcceptFilter;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Thread."<init>":()V
         4: aload_0
         5: aload_0
         6: invokespecial #7                  // Method java/lang/Thread.threadId:()J
         9: invokedynamic #11,  0             // InvokeDynamic #0:makeConcatWithConstants:(J)Ljava/lang/String;
        14: invokespecial #15                 // Method java/lang/Thread.setName:(Ljava/lang/String;)V
        17: aload_0
        18: aload_1
        19: getfield      #19                 // Field ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_SIZE:I
        22: putfield      #25                 // Field HELPER_BUFFER_SIZE:I
        25: aload_0
        26: aload_1
        27: getfield      #28                 // Field ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_COUNT:I
        30: putfield      #31                 // Field HELPER_BUFFER_COUNT:I
        33: aload_0
        34: aload_1
        35: getfield      #32                 // Field ext/mods/commons/mmocore/SelectorConfig.MAX_SEND_PER_PASS:I
        38: putfield      #35                 // Field MAX_SEND_PER_PASS:I
        41: aload_0
        42: aload_1
        43: getfield      #36                 // Field ext/mods/commons/mmocore/SelectorConfig.MAX_READ_PER_PASS:I
        46: putfield      #39                 // Field MAX_READ_PER_PASS:I
        49: aload_0
        50: aload_1
        51: getfield      #40                 // Field ext/mods/commons/mmocore/SelectorConfig.SLEEP_TIME:I
        54: i2l
        55: putfield      #43                 // Field SLEEP_TIME:J
        58: aload_0
        59: aload_1
        60: getfield      #46                 // Field ext/mods/commons/mmocore/SelectorConfig.TCP_NODELAY:Z
        63: putfield      #50                 // Field TCP_NODELAY:Z
        66: aload_0
        67: aload_1
        68: getfield      #51                 // Field ext/mods/commons/mmocore/SelectorConfig.WRITE_BUFFER_SIZE:I
        71: invokestatic  #54                 // Method java/nio/ByteBuffer.allocateDirect:(I)Ljava/nio/ByteBuffer;
        74: getstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
        77: invokevirtual #64                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        80: putfield      #68                 // Field DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
        83: aload_0
        84: aload_1
        85: getfield      #51                 // Field ext/mods/commons/mmocore/SelectorConfig.WRITE_BUFFER_SIZE:I
        88: newarray       byte
        90: invokestatic  #72                 // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        93: getstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
        96: invokevirtual #64                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        99: putfield      #76                 // Field WRITE_BUFFER:Ljava/nio/ByteBuffer;
       102: aload_0
       103: aload_1
       104: getfield      #79                 // Field ext/mods/commons/mmocore/SelectorConfig.READ_BUFFER_SIZE:I
       107: newarray       byte
       109: invokestatic  #72                 // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
       112: getstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
       115: invokevirtual #64                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
       118: putfield      #82                 // Field READ_BUFFER:Ljava/nio/ByteBuffer;
       121: aload_0
       122: new           #85                 // class ext/mods/commons/mmocore/NioNetStringBuffer
       125: dup
       126: ldc           #87                 // int 65536
       128: invokespecial #88                 // Method ext/mods/commons/mmocore/NioNetStringBuffer."<init>":(I)V
       131: putfield      #91                 // Field STRING_BUFFER:Lext/mods/commons/mmocore/NioNetStringBuffer;
       134: aload_0
       135: new           #95                 // class ext/mods/commons/mmocore/NioNetStackList
       138: dup
       139: invokespecial #97                 // Method ext/mods/commons/mmocore/NioNetStackList."<init>":()V
       142: putfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
       145: aload_0
       146: new           #102                // class java/util/LinkedList
       149: dup
       150: invokespecial #104                // Method java/util/LinkedList."<init>":()V
       153: putfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
       156: iconst_0
       157: istore        6
       159: iload         6
       161: aload_0
       162: getfield      #31                 // Field HELPER_BUFFER_COUNT:I
       165: if_icmpge     196
       168: aload_0
       169: getfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
       172: aload_0
       173: getfield      #25                 // Field HELPER_BUFFER_SIZE:I
       176: newarray       byte
       178: invokestatic  #72                 // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
       181: getstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
       184: invokevirtual #64                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
       187: invokevirtual #109                // Method java/util/LinkedList.addLast:(Ljava/lang/Object;)V
       190: iinc          6, 1
       193: goto          159
       196: aload_0
       197: aload         5
       199: putfield      #113                // Field _acceptFilter:Lext/mods/commons/mmocore/IAcceptFilter;
       202: aload_0
       203: aload_3
       204: putfield      #117                // Field _packetHandler:Lext/mods/commons/mmocore/IPacketHandler;
       207: aload_0
       208: aload         4
       210: putfield      #121                // Field _clientFactory:Lext/mods/commons/mmocore/IClientFactory;
       213: aload_0
       214: aload_2
       215: putfield      #125                // Field _executor:Lext/mods/commons/mmocore/IMMOExecutor;
       218: aload_0
       219: invokestatic  #129                // Method java/nio/channels/Selector.open:()Ljava/nio/channels/Selector;
       222: putfield      #135                // Field _selector:Ljava/nio/channels/Selector;
       225: return
      LineNumberTable:
        line 66: 0
        line 67: 4
        line 69: 17
        line 70: 25
        line 71: 33
        line 72: 41
        line 74: 49
        line 75: 58
        line 77: 66
        line 78: 83
        line 79: 102
        line 81: 121
        line 83: 134
        line 84: 145
        line 86: 156
        line 87: 168
        line 86: 190
        line 89: 196
        line 90: 202
        line 91: 207
        line 92: 213
        line 93: 218
        line 94: 225
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          159      37     6     i   I
            0     226     0  this   Lext/mods/commons/mmocore/SelectorThread;
            0     226     1    sc   Lext/mods/commons/mmocore/SelectorConfig;
            0     226     2 executor   Lext/mods/commons/mmocore/IMMOExecutor;
            0     226     3 packetHandler   Lext/mods/commons/mmocore/IPacketHandler;
            0     226     4 clientFactory   Lext/mods/commons/mmocore/IClientFactory;
            0     226     5 acceptFilter   Lext/mods/commons/mmocore/IAcceptFilter;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     226     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
            0     226     2 executor   Lext/mods/commons/mmocore/IMMOExecutor<TT;>;
            0     226     3 packetHandler   Lext/mods/commons/mmocore/IPacketHandler<TT;>;
            0     226     4 clientFactory   Lext/mods/commons/mmocore/IClientFactory<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 159
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class ext/mods/commons/mmocore/SelectorConfig, class ext/mods/commons/mmocore/IMMOExecutor, class ext/mods/commons/mmocore/IPacketHandler, class ext/mods/commons/mmocore/IClientFactory, class ext/mods/commons/mmocore/IAcceptFilter, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 36
    Exceptions:
      throws java.io.IOException
    Signature: #506                         // (Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor<TT;>;Lext/mods/commons/mmocore/IPacketHandler<TT;>;Lext/mods/commons/mmocore/IClientFactory<TT;>;Lext/mods/commons/mmocore/IAcceptFilter;)V

  public final void openServerSocket(java.net.InetAddress, int) throws java.io.IOException;
    descriptor: (Ljava/net/InetAddress;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=3
         0: invokestatic  #139                // Method java/nio/channels/ServerSocketChannel.open:()Ljava/nio/channels/ServerSocketChannel;
         3: astore_3
         4: aload_3
         5: iconst_0
         6: invokevirtual #144                // Method java/nio/channels/ServerSocketChannel.configureBlocking:(Z)Ljava/nio/channels/SelectableChannel;
         9: pop
        10: aload_3
        11: invokevirtual #148                // Method java/nio/channels/ServerSocketChannel.socket:()Ljava/net/ServerSocket;
        14: aload_1
        15: ifnonnull     29
        18: new           #152                // class java/net/InetSocketAddress
        21: dup
        22: iload_2
        23: invokespecial #154                // Method java/net/InetSocketAddress."<init>":(I)V
        26: goto          38
        29: new           #152                // class java/net/InetSocketAddress
        32: dup
        33: aload_1
        34: iload_2
        35: invokespecial #155                // Method java/net/InetSocketAddress."<init>":(Ljava/net/InetAddress;I)V
        38: invokevirtual #158                // Method java/net/ServerSocket.bind:(Ljava/net/SocketAddress;)V
        41: aload_3
        42: aload_0
        43: getfield      #135                // Field _selector:Ljava/nio/channels/Selector;
        46: bipush        16
        48: invokevirtual #166                // Method java/nio/channels/ServerSocketChannel.register:(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
        51: pop
        52: return
      LineNumberTable:
        line 98: 0
        line 99: 4
        line 100: 10
        line 101: 41
        line 102: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/commons/mmocore/SelectorThread;
            0      53     1 address   Ljava/net/InetAddress;
            0      53     2 tcpPort   I
            4      49     3 selectable   Ljava/nio/channels/ServerSocketChannel;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class java/net/InetAddress, int, class java/nio/channels/ServerSocketChannel ]
          stack = [ class java/net/ServerSocket ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class java/net/InetAddress, int, class java/nio/channels/ServerSocketChannel ]
          stack = [ class java/net/ServerSocket, class java/net/InetSocketAddress ]
    Exceptions:
      throws java.io.IOException

  final java.nio.ByteBuffer getPooledBuffer();
    descriptor: ()Ljava/nio/ByteBuffer;
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
         4: invokevirtual #170                // Method java/util/LinkedList.isEmpty:()Z
         7: ifeq          26
        10: aload_0
        11: getfield      #25                 // Field HELPER_BUFFER_SIZE:I
        14: newarray       byte
        16: invokestatic  #72                 // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        19: getstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
        22: invokevirtual #64                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        25: areturn
        26: aload_0
        27: getfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
        30: invokevirtual #174                // Method java/util/LinkedList.removeFirst:()Ljava/lang/Object;
        33: checkcast     #55                 // class java/nio/ByteBuffer
        36: areturn
      LineNumberTable:
        line 106: 0
        line 107: 10
        line 109: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/mmocore/SelectorThread;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 26 /* same */

  final void recycleBuffer(java.nio.ByteBuffer);
    descriptor: (Ljava/nio/ByteBuffer;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
         4: invokevirtual #178                // Method java/util/LinkedList.size:()I
         7: aload_0
         8: getfield      #31                 // Field HELPER_BUFFER_COUNT:I
        11: if_icmpge     27
        14: aload_1
        15: invokevirtual #182                // Method java/nio/ByteBuffer.clear:()Ljava/nio/ByteBuffer;
        18: pop
        19: aload_0
        20: getfield      #105                // Field _bufferPool:Ljava/util/LinkedList;
        23: aload_1
        24: invokevirtual #109                // Method java/util/LinkedList.addLast:(Ljava/lang/Object;)V
        27: return
      LineNumberTable:
        line 114: 0
        line 116: 14
        line 117: 19
        line 119: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/mmocore/SelectorThread;
            0      28     1   buf   Ljava/nio/ByteBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  public final void run();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=8, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #186                // Field _shutdown:Z
         6: ifne          284
         9: aload_0
        10: getfield      #135                // Field _selector:Ljava/nio/channels/Selector;
        13: invokevirtual #189                // Method java/nio/channels/Selector.selectNow:()I
        16: istore_1
        17: goto          27
        20: astore        5
        22: aload         5
        24: invokevirtual #194                // Method java/io/IOException.printStackTrace:()V
        27: iload_1
        28: ifle          194
        31: aload_0
        32: getfield      #135                // Field _selector:Ljava/nio/channels/Selector;
        35: invokevirtual #197                // Method java/nio/channels/Selector.selectedKeys:()Ljava/util/Set;
        38: invokeinterface #201,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        43: astore        4
        45: aload         4
        47: invokeinterface #207,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        52: ifeq          194
        55: aload         4
        57: invokeinterface #212,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        62: checkcast     #164                // class java/nio/channels/SelectionKey
        65: astore_2
        66: aload         4
        68: invokeinterface #215,  1          // InterfaceMethod java/util/Iterator.remove:()V
        73: aload_2
        74: invokevirtual #218                // Method java/nio/channels/SelectionKey.attachment:()Ljava/lang/Object;
        77: checkcast     #221                // class ext/mods/commons/mmocore/MMOConnection
        80: astore_3
        81: aload_2
        82: invokevirtual #223                // Method java/nio/channels/SelectionKey.readyOps:()I
        85: lookupswitch  { // 5

                       1: 154

                       4: 163

                       5: 172

                       8: 136

                      16: 145
                 default: 191
            }
       136: aload_0
       137: aload_2
       138: aload_3
       139: invokevirtual #226                // Method finishConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       142: goto          191
       145: aload_0
       146: aload_2
       147: aload_3
       148: invokevirtual #230                // Method acceptConnection:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       151: goto          191
       154: aload_0
       155: aload_2
       156: aload_3
       157: invokevirtual #233                // Method readPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       160: goto          191
       163: aload_0
       164: aload_2
       165: aload_3
       166: invokevirtual #236                // Method writePacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       169: goto          191
       172: aload_0
       173: aload_2
       174: aload_3
       175: invokevirtual #236                // Method writePacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       178: aload_2
       179: invokevirtual #239                // Method java/nio/channels/SelectionKey.isValid:()Z
       182: ifeq          191
       185: aload_0
       186: aload_2
       187: aload_3
       188: invokevirtual #233                // Method readPacket:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       191: goto          45
       194: aload_0
       195: getfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
       198: dup
       199: astore        5
       201: monitorenter
       202: aload_0
       203: getfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
       206: invokevirtual #242                // Method ext/mods/commons/mmocore/NioNetStackList.isEmpty:()Z
       209: ifne          250
       212: aload_0
       213: getfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
       216: invokevirtual #243                // Method ext/mods/commons/mmocore/NioNetStackList.removeFirst:()Ljava/lang/Object;
       219: checkcast     #221                // class ext/mods/commons/mmocore/MMOConnection
       222: astore_3
       223: aload_0
       224: aload_3
       225: invokevirtual #244                // Method writeClosePacket:(Lext/mods/commons/mmocore/MMOConnection;)V
       228: aload_0
       229: aload_3
       230: invokevirtual #248                // Method ext/mods/commons/mmocore/MMOConnection.getSelectionKey:()Ljava/nio/channels/SelectionKey;
       233: aload_3
       234: invokevirtual #252                // Method closeConnectionImpl:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       237: goto          202
       240: astore        6
       242: aload         6
       244: invokevirtual #257                // Method java/lang/Exception.printStackTrace:()V
       247: goto          202
       250: aload         5
       252: monitorexit
       253: goto          264
       256: astore        7
       258: aload         5
       260: monitorexit
       261: aload         7
       263: athrow
       264: aload_0
       265: getfield      #43                 // Field SLEEP_TIME:J
       268: invokestatic  #258                // Method java/lang/Thread.sleep:(J)V
       271: goto          2
       274: astore        5
       276: aload         5
       278: invokevirtual #264                // Method java/lang/InterruptedException.printStackTrace:()V
       281: goto          2
       284: aload_0
       285: invokevirtual #265                // Method closeSelectorThread:()V
       288: return
      Exception table:
         from    to  target type
             9    17    20   Class java/io/IOException
           212   237   240   Class java/lang/Exception
           202   253   256   any
           256   261   256   any
           264   271   274   Class java/lang/InterruptedException
      LineNumberTable:
        line 125: 0
        line 132: 2
        line 136: 9
        line 141: 17
        line 138: 20
        line 140: 22
        line 143: 27
        line 145: 31
        line 147: 45
        line 149: 55
        line 150: 66
        line 152: 73
        line 154: 81
        line 157: 136
        line 158: 142
        line 161: 145
        line 162: 151
        line 165: 154
        line 166: 160
        line 169: 163
        line 170: 169
        line 173: 172
        line 174: 178
        line 175: 185
        line 176: 191
        line 181: 194
        line 183: 202
        line 187: 212
        line 188: 223
        line 189: 228
        line 194: 237
        line 191: 240
        line 193: 242
        line 194: 247
        line 196: 250
        line 200: 264
        line 205: 271
        line 202: 274
        line 204: 276
        line 205: 281
        line 207: 284
        line 208: 288
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22       5     5     e   Ljava/io/IOException;
           66     128     2   key   Ljava/nio/channels/SelectionKey;
           81     113     3   con   Lext/mods/commons/mmocore/MMOConnection;
           45     149     4 selectedKeys   Ljava/util/Iterator;
          223      17     3   con   Lext/mods/commons/mmocore/MMOConnection;
          242       5     6     e   Ljava/lang/Exception;
          276       5     5     e   Ljava/lang/InterruptedException;
            0     289     0  this   Lext/mods/commons/mmocore/SelectorThread;
            2     287     1 selectedKeysCount   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           81     113     3   con   Lext/mods/commons/mmocore/MMOConnection<TT;>;
           45     149     4 selectedKeys   Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;
          223      17     3   con   Lext/mods/commons/mmocore/MMOConnection<TT;>;
            0     289     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 6 /* same */
        frame_type = 254 /* append */
          offset_delta = 17
          locals = [ top, top, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/commons/mmocore/SelectorThread, int, class java/nio/channels/SelectionKey, class ext/mods/commons/mmocore/MMOConnection, class java/util/Iterator ]
          stack = []
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 18 /* same */
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/commons/mmocore/SelectorThread, int, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 101 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/commons/mmocore/SelectorThread, int ]
          stack = []
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/InterruptedException ]
        frame_type = 9 /* same */

  protected final void writePacket(java.nio.channels.SelectionKey, ext.mods.commons.mmocore.MMOConnection<T>);
    descriptor: (Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: aload_2
         2: invokevirtual #433                // Method prepareWriteBuffer:(Lext/mods/commons/mmocore/MMOConnection;)Z
         5: ifne          21
         8: aload_1
         9: aload_1
        10: invokevirtual #286                // Method java/nio/channels/SelectionKey.interestOps:()I
        13: bipush        -5
        15: iand
        16: invokevirtual #289                // Method java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
        19: pop
        20: return
        21: aload_0
        22: getfield      #68                 // Field DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
        25: invokevirtual #344                // Method java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
        28: pop
        29: aload_0
        30: getfield      #68                 // Field DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
        33: invokevirtual #351                // Method java/nio/ByteBuffer.remaining:()I
        36: istore_3
        37: iconst_m1
        38: istore        4
        40: aload_2
        41: aload_0
        42: getfield      #68                 // Field DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
        45: invokevirtual #430                // Method ext/mods/commons/mmocore/MMOConnection.write:(Ljava/nio/ByteBuffer;)I
        48: istore        4
        50: goto          55
        53: astore        5
        55: iload         4
        57: iflt          131
        60: iload         4
        62: iload_3
        63: if_icmpne     120
        66: aload_2
        67: invokevirtual #420                // Method ext/mods/commons/mmocore/MMOConnection.getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
        70: dup
        71: astore        5
        73: monitorenter
        74: aload_2
        75: invokevirtual #420                // Method ext/mods/commons/mmocore/MMOConnection.getSendQueue:()Lext/mods/commons/mmocore/NioNetStackList;
        78: invokevirtual #242                // Method ext/mods/commons/mmocore/NioNetStackList.isEmpty:()Z
        81: ifeq          103
        84: aload_2
        85: invokevirtual #437                // Method ext/mods/commons/mmocore/MMOConnection.hasPendingWriteBuffer:()Z
        88: ifne          103
        91: aload_1
        92: aload_1
        93: invokevirtual #286                // Method java/nio/channels/SelectionKey.interestOps:()I
        96: bipush        -5
        98: iand
        99: invokevirtual #289                // Method java/nio/channels/SelectionKey.interestOps:(I)Ljava/nio/channels/SelectionKey;
       102: pop
       103: aload         5
       105: monitorexit
       106: goto          117
       109: astore        6
       111: aload         5
       113: monitorexit
       114: aload         6
       116: athrow
       117: goto          144
       120: aload_2
       121: aload_0
       122: getfield      #68                 // Field DIRECT_WRITE_BUFFER:Ljava/nio/ByteBuffer;
       125: invokevirtual #440                // Method ext/mods/commons/mmocore/MMOConnection.createWriteBuffer:(Ljava/nio/ByteBuffer;)V
       128: goto          144
       131: aload_2
       132: invokevirtual #277                // Method ext/mods/commons/mmocore/MMOConnection.getClient:()Lext/mods/commons/mmocore/MMOClient;
       135: invokevirtual #281                // Method ext/mods/commons/mmocore/MMOClient.onForcedDisconnection:()V
       138: aload_0
       139: aload_1
       140: aload_2
       141: invokevirtual #252                // Method closeConnectionImpl:(Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection;)V
       144: return
      Exception table:
         from    to  target type
            40    50    53   Class java/io/IOException
            74   106   109   any
           109   114   109   any
      LineNumberTable:
        line 440: 0
        line 442: 8
        line 443: 20
        line 446: 21
        line 448: 29
        line 450: 37
        line 454: 40
        line 458: 50
        line 456: 53
        line 460: 55
        line 462: 60
        line 464: 66
        line 466: 74
        line 468: 91
        line 470: 103
        line 473: 120
        line 477: 131
        line 478: 138
        line 480: 144
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     145     0  this   Lext/mods/commons/mmocore/SelectorThread;
            0     145     1   key   Ljava/nio/channels/SelectionKey;
            0     145     2   con   Lext/mods/commons/mmocore/MMOConnection;
           37     108     3  size   I
           40     105     4 result   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     145     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
            0     145     2   con   Lext/mods/commons/mmocore/MMOConnection<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class java/nio/channels/SelectionKey, class ext/mods/commons/mmocore/MMOConnection, int, int ]
          stack = [ class java/io/IOException ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class java/lang/Object ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 10 /* same */
        frame_type = 12 /* same */
    Signature: #533                         // (Ljava/nio/channels/SelectionKey;Lext/mods/commons/mmocore/MMOConnection<TT;>;)V

  final void closeConnection(ext.mods.commons.mmocore.MMOConnection<T>);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #98                 // Field _pendingClose:Lext/mods/commons/mmocore/NioNetStackList;
        11: aload_1
        12: invokevirtual #457                // Method ext/mods/commons/mmocore/NioNetStackList.addLast:(Ljava/lang/Object;)V
        15: aload_2
        16: monitorexit
        17: goto          25
        20: astore_3
        21: aload_2
        22: monitorexit
        23: aload_3
        24: athrow
        25: return
      Exception table:
         from    to  target type
             7    17    20   any
            20    23    20   any
      LineNumberTable:
        line 556: 0
        line 558: 7
        line 559: 15
        line 560: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/mmocore/SelectorThread;
            0      26     1   con   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
            0      26     1   con   Lext/mods/commons/mmocore/MMOConnection<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class ext/mods/commons/mmocore/MMOConnection, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
    Signature: #544                         // (Lext/mods/commons/mmocore/MMOConnection<TT;>;)V

  public final void shutdown();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #186                // Field _shutdown:Z
         5: return
      LineNumberTable:
        line 588: 0
        line 589: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/SelectorThread;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;

  protected void closeSelectorThread();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=4, args_size=1
         0: aload_0
         1: getfield      #135                // Field _selector:Ljava/nio/channels/Selector;
         4: invokevirtual #468                // Method java/nio/channels/Selector.keys:()Ljava/util/Set;
         7: invokeinterface #201,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        12: astore_1
        13: aload_1
        14: invokeinterface #207,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        19: ifeq          46
        22: aload_1
        23: invokeinterface #212,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #164                // class java/nio/channels/SelectionKey
        31: astore_2
        32: aload_2
        33: invokevirtual #268                // Method java/nio/channels/SelectionKey.channel:()Ljava/nio/channels/SelectableChannel;
        36: invokevirtual #471                // Method java/nio/channels/SelectableChannel.close:()V
        39: goto          43
        42: astore_3
        43: goto          13
        46: aload_0
        47: getfield      #135                // Field _selector:Ljava/nio/channels/Selector;
        50: invokevirtual #474                // Method java/nio/channels/Selector.close:()V
        53: goto          57
        56: astore_1
        57: return
      Exception table:
         from    to  target type
            32    39    42   Class java/io/IOException
            46    53    56   Class java/io/IOException
      LineNumberTable:
        line 593: 0
        line 597: 32
        line 601: 39
        line 599: 42
        line 602: 43
        line 606: 46
        line 610: 53
        line 608: 56
        line 611: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      11     2   key   Ljava/nio/channels/SelectionKey;
            0      58     0  this   Lext/mods/commons/mmocore/SelectorThread;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/commons/mmocore/SelectorThread<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/commons/mmocore/SelectorThread, class java/util/Iterator, class java/nio/channels/SelectionKey ]
          stack = [ class java/io/IOException ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 0 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #475                // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
         3: putstatic     #60                 // Field BYTE_ORDER:Ljava/nio/ByteOrder;
         6: return
      LineNumberTable:
        line 35: 0
}
Signature: #564                         // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Thread;
SourceFile: "SelectorThread.java"
BootstrapMethods:
  0: #570 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #568 SelectorThread-\u0001
InnerClasses:
  public static final #581= #577 of #579; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
