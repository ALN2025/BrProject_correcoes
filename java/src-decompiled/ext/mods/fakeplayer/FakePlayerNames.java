// Bytecode for: ext.mods.fakeplayer.FakePlayerNames
// File: ext\mods\fakeplayer\FakePlayerNames.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayerNames.class
  Last modified 9 de jul de 2026; size 9133 bytes
  MD5 checksum 199204c4cacc7089b32921719047e7de
  Compiled from "FakePlayerNames.java"
public class ext.mods.fakeplayer.FakePlayerNames
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/fakeplayer/FakePlayerNames
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
    #8 = Class              #10           // ext/mods/gameserver/enums/actors/Sex
    #9 = NameAndType        #11:#12       // MALE:Lext/mods/gameserver/enums/actors/Sex;
   #10 = Utf8               ext/mods/gameserver/enums/actors/Sex
   #11 = Utf8               MALE
   #12 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
   #13 = Fieldref           #14.#15       // ext/mods/fakeplayer/FakePlayerNames.MALE_NAMES:Ljava/util/List;
   #14 = Class              #16           // ext/mods/fakeplayer/FakePlayerNames
   #15 = NameAndType        #17:#18       // MALE_NAMES:Ljava/util/List;
   #16 = Utf8               ext/mods/fakeplayer/FakePlayerNames
   #17 = Utf8               MALE_NAMES
   #18 = Utf8               Ljava/util/List;
   #19 = Fieldref           #14.#20       // ext/mods/fakeplayer/FakePlayerNames.FEMALE_NAMES:Ljava/util/List;
   #20 = NameAndType        #21:#18       // FEMALE_NAMES:Ljava/util/List;
   #21 = Utf8               FEMALE_NAMES
   #22 = InterfaceMethodref #23.#24       // java/util/List.isEmpty:()Z
   #23 = Class              #25           // java/util/List
   #24 = NameAndType        #26:#27       // isEmpty:()Z
   #25 = Utf8               java/util/List
   #26 = Utf8               isEmpty
   #27 = Utf8               ()Z
   #28 = Class              #29           // java/util/ArrayList
   #29 = Utf8               java/util/ArrayList
   #30 = Methodref          #28.#31       // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #31 = NameAndType        #5:#32        // "<init>":(Ljava/util/Collection;)V
   #32 = Utf8               (Ljava/util/Collection;)V
   #33 = InterfaceMethodref #23.#34       // java/util/List.iterator:()Ljava/util/Iterator;
   #34 = NameAndType        #35:#36       // iterator:()Ljava/util/Iterator;
   #35 = Utf8               iterator
   #36 = Utf8               ()Ljava/util/Iterator;
   #37 = InterfaceMethodref #38.#39       // java/util/Iterator.hasNext:()Z
   #38 = Class              #40           // java/util/Iterator
   #39 = NameAndType        #41:#27       // hasNext:()Z
   #40 = Utf8               java/util/Iterator
   #41 = Utf8               hasNext
   #42 = InterfaceMethodref #38.#43       // java/util/Iterator.next:()Ljava/lang/Object;
   #43 = NameAndType        #44:#45       // next:()Ljava/lang/Object;
   #44 = Utf8               next
   #45 = Utf8               ()Ljava/lang/Object;
   #46 = Class              #47           // java/lang/String
   #47 = Utf8               java/lang/String
   #48 = Methodref          #49.#50       // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #49 = Class              #51           // ext/mods/gameserver/data/sql/PlayerInfoTable
   #50 = NameAndType        #52:#53       // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #51 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
   #52 = Utf8               getInstance
   #53 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #54 = Methodref          #49.#55       // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
   #55 = NameAndType        #56:#57       // getPlayerObjectId:(Ljava/lang/String;)I
   #56 = Utf8               getPlayerObjectId
   #57 = Utf8               (Ljava/lang/String;)I
   #58 = InterfaceMethodref #23.#59       // java/util/List.remove:(Ljava/lang/Object;)Z
   #59 = NameAndType        #60:#61       // remove:(Ljava/lang/Object;)Z
   #60 = Utf8               remove
   #61 = Utf8               (Ljava/lang/Object;)Z
   #62 = Fieldref           #14.#63       // ext/mods/fakeplayer/FakePlayerNames.USED_NAMES:Ljava/util/List;
   #63 = NameAndType        #64:#18       // USED_NAMES:Ljava/util/List;
   #64 = Utf8               USED_NAMES
   #65 = InterfaceMethodref #23.#66       // java/util/List.add:(Ljava/lang/Object;)Z
   #66 = NameAndType        #67:#61       // add:(Ljava/lang/Object;)Z
   #67 = Utf8               add
   #68 = Methodref          #46.#24       // java/lang/String.isEmpty:()Z
   #69 = Methodref          #70.#71       // java/util/Collections.sort:(Ljava/util/List;)V
   #70 = Class              #72           // java/util/Collections
   #71 = NameAndType        #73:#74       // sort:(Ljava/util/List;)V
   #72 = Utf8               java/util/Collections
   #73 = Utf8               sort
   #74 = Utf8               (Ljava/util/List;)V
   #75 = Methodref          #28.#3        // java/util/ArrayList."<init>":()V
   #76 = String             #77           // Arthur
   #77 = Utf8               Arthur
   #78 = String             #79           // Lucian
   #79 = Utf8               Lucian
   #80 = String             #81           // Draven
   #81 = Utf8               Draven
   #82 = String             #83           // Garen
   #83 = Utf8               Garen
   #84 = String             #85           // Valen
   #85 = Utf8               Valen
   #86 = String             #87           // Kael
   #87 = Utf8               Kael
   #88 = String             #89           // Darius
   #89 = Utf8               Darius
   #90 = String             #91           // Talon
   #91 = Utf8               Talon
   #92 = String             #93           // Alaric
   #93 = Utf8               Alaric
   #94 = String             #95           // Thorne
   #95 = Utf8               Thorne
   #96 = String             #97           // Cedric
   #97 = Utf8               Cedric
   #98 = String             #99           // Theron
   #99 = Utf8               Theron
  #100 = String             #101          // Leoric
  #101 = Utf8               Leoric
  #102 = String             #103          // Balthazar
  #103 = Utf8               Balthazar
  #104 = String             #105          // Rowan
  #105 = Utf8               Rowan
  #106 = String             #107          // Aedric
  #107 = Utf8               Aedric
  #108 = String             #109          // Corwin
  #109 = Utf8               Corwin
  #110 = String             #111          // Sylas
  #111 = Utf8               Sylas
  #112 = String             #113          // Orin
  #113 = Utf8               Orin
  #114 = String             #115          // Thalion
  #115 = Utf8               Thalion
  #116 = String             #117          // Ronan
  #117 = Utf8               Ronan
  #118 = String             #119          // Evander
  #119 = Utf8               Evander
  #120 = String             #121          // Fenris
  #121 = Utf8               Fenris
  #122 = String             #123          // Kaelen
  #123 = Utf8               Kaelen
  #124 = String             #125          // Auron
  #125 = Utf8               Auron
  #126 = String             #127          // Gideon
  #127 = Utf8               Gideon
  #128 = String             #129          // Malric
  #129 = Utf8               Malric
  #130 = String             #131          // Hadrian
  #131 = Utf8               Hadrian
  #132 = String             #133          // Tyrion
  #133 = Utf8               Tyrion
  #134 = String             #135          // Cassian
  #135 = Utf8               Cassian
  #136 = String             #137          // Eryk
  #137 = Utf8               Eryk
  #138 = String             #139          // Ashur
  #139 = Utf8               Ashur
  #140 = String             #141          // Soren
  #141 = Utf8               Soren
  #142 = String             #143          // Lucius
  #143 = Utf8               Lucius
  #144 = String             #145          // Kieran
  #145 = Utf8               Kieran
  #146 = String             #147          // Elias
  #147 = Utf8               Elias
  #148 = String             #149          // Zephyr
  #149 = Utf8               Zephyr
  #150 = String             #151          // Varek
  #151 = Utf8               Varek
  #152 = String             #153          // Calen
  #153 = Utf8               Calen
  #154 = String             #155          // Renar
  #155 = Utf8               Renar
  #156 = String             #157          // Magnus
  #157 = Utf8               Magnus
  #158 = String             #159          // Daelen
  #159 = Utf8               Daelen
  #160 = String             #161          // Beren
  #161 = Utf8               Beren
  #162 = String             #163          // Torin
  #163 = Utf8               Torin
  #164 = String             #165          // Xander
  #165 = Utf8               Xander
  #166 = String             #167          // Aric
  #167 = Utf8               Aric
  #168 = String             #169          // Ryder
  #169 = Utf8               Ryder
  #170 = String             #171          // Drake
  #171 = Utf8               Drake
  #172 = String             #173          // Jareth
  #173 = Utf8               Jareth
  #174 = String             #175          // Thane
  #175 = Utf8               Thane
  #176 = String             #177          // Varric
  #177 = Utf8               Varric
  #178 = String             #179          // Iskandar
  #179 = Utf8               Iskandar
  #180 = String             #181          // Lorien
  #181 = Utf8               Lorien
  #182 = String             #183          // Kellen
  #183 = Utf8               Kellen
  #184 = String             #185          // Alistair
  #185 = Utf8               Alistair
  #186 = String             #187          // Braeden
  #187 = Utf8               Braeden
  #188 = String             #189          // Mael
  #189 = Utf8               Mael
  #190 = String             #191          // Jarek
  #191 = Utf8               Jarek
  #192 = String             #193          // Ravyn
  #193 = Utf8               Ravyn
  #194 = String             #195          // Zarek
  #195 = Utf8               Zarek
  #196 = String             #197          // Caelum
  #197 = Utf8               Caelum
  #198 = String             #199          // Nikolai
  #199 = Utf8               Nikolai
  #200 = String             #201          // Damon
  #201 = Utf8               Damon
  #202 = String             #203          // Lucan
  #203 = Utf8               Lucan
  #204 = String             #205          // Aleron
  #205 = Utf8               Aleron
  #206 = String             #207          // Zane
  #207 = Utf8               Zane
  #208 = String             #209          // Eron
  #209 = Utf8               Eron
  #210 = String             #211          // Kalen
  #211 = Utf8               Kalen
  #212 = String             #213          // Rurik
  #213 = Utf8               Rurik
  #214 = String             #215          // Galen
  #215 = Utf8               Galen
  #216 = String             #217          // Caspian
  #217 = Utf8               Caspian
  #218 = String             #219          // Jax
  #219 = Utf8               Jax
  #220 = String             #221          // Orion
  #221 = Utf8               Orion
  #222 = String             #223          // Eamon
  #223 = Utf8               Eamon
  #224 = String             #225          // Veyron
  #225 = Utf8               Veyron
  #226 = String             #227          // Malik
  #227 = Utf8               Malik
  #228 = String             #229          // Korrin
  #229 = Utf8               Korrin
  #230 = String             #231          // Sirius
  #231 = Utf8               Sirius
  #232 = String             #233          // Kaine
  #233 = Utf8               Kaine
  #234 = String             #235          // Oberyn
  #235 = Utf8               Oberyn
  #236 = String             #237          // Therin
  #237 = Utf8               Therin
  #238 = String             #239          // Tristan
  #239 = Utf8               Tristan
  #240 = String             #241          // Roland
  #241 = Utf8               Roland
  #242 = String             #243          // Eldric
  #243 = Utf8               Eldric
  #244 = String             #245          // Zeth
  #245 = Utf8               Zeth
  #246 = String             #247          // Luther
  #247 = Utf8               Luther
  #248 = String             #249          // Darion
  #249 = Utf8               Darion
  #250 = String             #251          // Tiberius
  #251 = Utf8               Tiberius
  #252 = String             #253          // Falkor
  #253 = Utf8               Falkor
  #254 = String             #255          // Leif
  #255 = Utf8               Leif
  #256 = String             #257          // Aeron
  #257 = Utf8               Aeron
  #258 = String             #259          // Gavriel
  #259 = Utf8               Gavriel
  #260 = String             #261          // Myron
  #261 = Utf8               Myron
  #262 = String             #263          // Quint
  #263 = Utf8               Quint
  #264 = String             #265          // Torren
  #265 = Utf8               Torren
  #266 = String             #267          // Rhett
  #267 = Utf8               Rhett
  #268 = String             #269          // Hawke
  #269 = Utf8               Hawke
  #270 = String             #271          // Kelric
  #271 = Utf8               Kelric
  #272 = String             #273          // Dain
  #273 = Utf8               Dain
  #274 = String             #275          // Caius
  #275 = Utf8               Caius
  #276 = String             #277          // Ignis
  #277 = Utf8               Ignis
  #278 = String             #279          // Drael
  #279 = Utf8               Drael
  #280 = String             #281          // Arden
  #281 = Utf8               Arden
  #282 = String             #283          // Merek
  #283 = Utf8               Merek
  #284 = String             #285          // Sylvain
  #285 = Utf8               Sylvain
  #286 = String             #287          // Jorik
  #287 = Utf8               Jorik
  #288 = String             #289          // Brann
  #289 = Utf8               Brann
  #290 = String             #291          // Corvus
  #291 = Utf8               Corvus
  #292 = String             #293          // Thalos
  #293 = Utf8               Thalos
  #294 = String             #295          // Riven
  #295 = Utf8               Riven
  #296 = String             #297          // Darrek
  #297 = Utf8               Darrek
  #298 = String             #299          // Keldor
  #299 = Utf8               Keldor
  #300 = String             #301          // Judas
  #301 = Utf8               Judas
  #302 = String             #303          // Blaine
  #303 = Utf8               Blaine
  #304 = String             #305          // Kaemon
  #305 = Utf8               Kaemon
  #306 = String             #307          // Andros
  #307 = Utf8               Andros
  #308 = String             #309          // Xavian
  #309 = Utf8               Xavian
  #310 = String             #311          // Zoren
  #311 = Utf8               Zoren
  #312 = String             #313          // Laziel
  #313 = Utf8               Laziel
  #314 = String             #315          // Garrick
  #315 = Utf8               Garrick
  #316 = String             #317          // Darian
  #317 = Utf8               Darian
  #318 = String             #319          // Tavon
  #319 = Utf8               Tavon
  #320 = String             #321          // Aziel
  #321 = Utf8               Aziel
  #322 = String             #323          // Korran
  #323 = Utf8               Korran
  #324 = String             #325          // Cael
  #325 = Utf8               Cael
  #326 = String             #327          // Zephyrus
  #327 = Utf8               Zephyrus
  #328 = String             #329          // Emric
  #329 = Utf8               Emric
  #330 = String             #331          // Lazrus
  #331 = Utf8               Lazrus
  #332 = String             #333          // Hadrik
  #333 = Utf8               Hadrik
  #334 = String             #335          // Fenrik
  #335 = Utf8               Fenrik
  #336 = String             #337          // Cyrus
  #337 = Utf8               Cyrus
  #338 = String             #339          // Malthus
  #339 = Utf8               Malthus
  #340 = String             #341          // Drystan
  #341 = Utf8               Drystan
  #342 = String             #343          // Orren
  #343 = Utf8               Orren
  #344 = String             #345          // Rhogar
  #345 = Utf8               Rhogar
  #346 = String             #347          // Taran
  #347 = Utf8               Taran
  #348 = String             #349          // Brynden
  #349 = Utf8               Brynden
  #350 = String             #351          // Quorin
  #351 = Utf8               Quorin
  #352 = String             #353          // Eryndor
  #353 = Utf8               Eryndor
  #354 = String             #355          // Cassiel
  #355 = Utf8               Cassiel
  #356 = String             #357          // Marek
  #357 = Utf8               Marek
  #358 = String             #359          // Roderic
  #359 = Utf8               Roderic
  #360 = String             #361          // Davor
  #361 = Utf8               Davor
  #362 = String             #363          // Veylin
  #363 = Utf8               Veylin
  #364 = String             #365          // Zadric
  #365 = Utf8               Zadric
  #366 = String             #367          // Khalen
  #367 = Utf8               Khalen
  #368 = String             #369          // Alarion
  #369 = Utf8               Alarion
  #370 = String             #371          // Morthos
  #371 = Utf8               Morthos
  #372 = String             #373          // Ithran
  #373 = Utf8               Ithran
  #374 = String             #375          // Vrael
  #375 = Utf8               Vrael
  #376 = String             #377          // Tirion
  #377 = Utf8               Tirion
  #378 = String             #379          // Gareth
  #379 = Utf8               Gareth
  #380 = String             #381          // Durion
  #381 = Utf8               Durion
  #382 = String             #383          // Kaedin
  #383 = Utf8               Kaedin
  #384 = String             #385          // Thyr
  #385 = Utf8               Thyr
  #386 = String             #387          // Astar
  #387 = Utf8               Astar
  #388 = String             #389          // Aelric
  #389 = Utf8               Aelric
  #390 = String             #391          // Zale
  #391 = Utf8               Zale
  #392 = String             #393          // Korvin
  #393 = Utf8               Korvin
  #394 = String             #395          // Vandor
  #395 = Utf8               Vandor
  #396 = String             #397          // Eryx
  #397 = Utf8               Eryx
  #398 = String             #399          // Belric
  #399 = Utf8               Belric
  #400 = String             #401          // Fendrel
  #401 = Utf8               Fendrel
  #402 = String             #403          // Kalem
  #403 = Utf8               Kalem
  #404 = String             #405          // Nyron
  #405 = Utf8               Nyron
  #406 = String             #407          // Sevrin
  #407 = Utf8               Sevrin
  #408 = String             #409          // Orrick
  #409 = Utf8               Orrick
  #410 = String             #411          // Eirik
  #411 = Utf8               Eirik
  #412 = String             #413          // Torvyn
  #413 = Utf8               Torvyn
  #414 = String             #415          // Halrik
  #415 = Utf8               Halrik
  #416 = String             #417          // Stryke
  #417 = Utf8               Stryke
  #418 = String             #419          // Vorn
  #419 = Utf8               Vorn
  #420 = String             #421          // Kadrin
  #421 = Utf8               Kadrin
  #422 = String             #423          // Aethor
  #423 = Utf8               Aethor
  #424 = String             #425          // Dax
  #425 = Utf8               Dax
  #426 = String             #427          // Griffin
  #427 = Utf8               Griffin
  #428 = String             #429          // Drelan
  #429 = Utf8               Drelan
  #430 = String             #431          // Kaesor
  #431 = Utf8               Kaesor
  #432 = String             #433          // Miran
  #433 = Utf8               Miran
  #434 = String             #435          // Jorvan
  #435 = Utf8               Jorvan
  #436 = String             #437          // Balen
  #437 = Utf8               Balen
  #438 = String             #439          // Rowrick
  #439 = Utf8               Rowrick
  #440 = String             #441          // Quintis
  #441 = Utf8               Quintis
  #442 = String             #443          // Sareth
  #443 = Utf8               Sareth
  #444 = String             #445          // Drelik
  #445 = Utf8               Drelik
  #446 = Methodref          #70.#447      // java/util/Collections.addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
  #447 = NameAndType        #448:#449     // addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
  #448 = Utf8               addAll
  #449 = Utf8               (Ljava/util/Collection;[Ljava/lang/Object;)Z
  #450 = String             #451          // Luna
  #451 = Utf8               Luna
  #452 = String             #453          // Selene
  #453 = Utf8               Selene
  #454 = String             #455          // Aurora
  #455 = Utf8               Aurora
  #456 = String             #457          // Freya
  #457 = Utf8               Freya
  #458 = String             #459          // Lilith
  #459 = Utf8               Lilith
  #460 = String             #461          // Seraphina
  #461 = Utf8               Seraphina
  #462 = String             #463          // Isolde
  #463 = Utf8               Isolde
  #464 = String             #465          // Elira
  #465 = Utf8               Elira
  #466 = String             #467          // Nyx
  #467 = Utf8               Nyx
  #468 = String             #469          // Kairi
  #469 = Utf8               Kairi
  #470 = String             #471          // Aeliana
  #471 = Utf8               Aeliana
  #472 = String             #473          // Thalia
  #473 = Utf8               Thalia
  #474 = String             #475          // Lyra
  #475 = Utf8               Lyra
  #476 = String             #477          // Ravena
  #477 = Utf8               Ravena
  #478 = String             #479          // Sylva
  #479 = Utf8               Sylva
  #480 = String             #481          // Celeste
  #481 = Utf8               Celeste
  #482 = String             #483          // Aria
  #483 = Utf8               Aria
  #484 = String             #485          // Eira
  #485 = Utf8               Eira
  #486 = String             #487          // Zafira
  #487 = Utf8               Zafira
  #488 = String             #489          // Maelis
  #489 = Utf8               Maelis
  #490 = String             #491          // Ysolde
  #491 = Utf8               Ysolde
  #492 = String             #493          // Vespera
  #493 = Utf8               Vespera
  #494 = String             #495          // Melisande
  #495 = Utf8               Melisande
  #496 = String             #497          // Kaelia
  #497 = Utf8               Kaelia
  #498 = String             #499          // Evelyne
  #499 = Utf8               Evelyne
  #500 = String             #501          // Saphira
  #501 = Utf8               Saphira
  #502 = String             #503          // Mirelle
  #503 = Utf8               Mirelle
  #504 = String             #505          // Calista
  #505 = Utf8               Calista
  #506 = String             #507          // Aeris
  #507 = Utf8               Aeris
  #508 = String             #509          // Naeris
  #509 = Utf8               Naeris
  #510 = String             #511          // Tahlia
  #511 = Utf8               Tahlia
  #512 = String             #513          // Fiora
  #513 = Utf8               Fiora
  #514 = String             #515          // Liora
  #515 = Utf8               Liora
  #516 = String             #517          // Mirabel
  #517 = Utf8               Mirabel
  #518 = String             #519          // Zelena
  #519 = Utf8               Zelena
  #520 = String             #521          // Vanya
  #521 = Utf8               Vanya
  #522 = String             #523          // Elowen
  #523 = Utf8               Elowen
  #524 = String             #525          // Seren
  #525 = Utf8               Seren
  #526 = String             #527          // Taliah
  #527 = Utf8               Taliah
  #528 = String             #529          // Ilyana
  #529 = Utf8               Ilyana
  #530 = String             #531          // Nerissa
  #531 = Utf8               Nerissa
  #532 = String             #533          // Anara
  #533 = Utf8               Anara
  #534 = String             #535          // Coraline
  #535 = Utf8               Coraline
  #536 = String             #537          // Brielle
  #537 = Utf8               Brielle
  #538 = String             #539          // Isara
  #539 = Utf8               Isara
  #540 = String             #541          // Amaris
  #541 = Utf8               Amaris
  #542 = String             #543          // Zephyra
  #543 = Utf8               Zephyra
  #544 = String             #545          // Orla
  #545 = Utf8               Orla
  #546 = String             #547          // Lunara
  #547 = Utf8               Lunara
  #548 = String             #549          // Thessia
  #549 = Utf8               Thessia
  #550 = String             #551          // Aelith
  #551 = Utf8               Aelith
  #552 = String             #553          // Selindra
  #553 = Utf8               Selindra
  #554 = String             #555          // Kyria
  #555 = Utf8               Kyria
  #556 = String             #557          // Velena
  #557 = Utf8               Velena
  #558 = String             #559          // Nimue
  #559 = Utf8               Nimue
  #560 = String             #561          // Saren
  #561 = Utf8               Saren
  #562 = String             #563          // Eirlys
  #563 = Utf8               Eirlys
  #564 = String             #565          // Vaela
  #565 = Utf8               Vaela
  #566 = String             #567          // Maris
  #567 = Utf8               Maris
  #568 = String             #569          // Yrene
  #569 = Utf8               Yrene
  #570 = String             #571          // Alira
  #571 = Utf8               Alira
  #572 = String             #573          // Sanya
  #573 = Utf8               Sanya
  #574 = String             #575          // Caelia
  #575 = Utf8               Caelia
  #576 = String             #577          // Elanil
  #577 = Utf8               Elanil
  #578 = String             #579          // Myra
  #579 = Utf8               Myra
  #580 = String             #581          // Astrid
  #581 = Utf8               Astrid
  #582 = String             #583          // Dahlia
  #583 = Utf8               Dahlia
  #584 = String             #585          // Kassia
  #585 = Utf8               Kassia
  #586 = String             #587          // Nyssa
  #587 = Utf8               Nyssa
  #588 = String             #589          // Vaeria
  #589 = Utf8               Vaeria
  #590 = String             #591          // Althea
  #591 = Utf8               Althea
  #592 = String             #593          // Elaena
  #593 = Utf8               Elaena
  #594 = String             #595          // Saphyra
  #595 = Utf8               Saphyra
  #596 = String             #597          // Meliora
  #597 = Utf8               Meliora
  #598 = String             #599          // Ishara
  #599 = Utf8               Ishara
  #600 = String             #601          // Nysa
  #601 = Utf8               Nysa
  #602 = String             #603          // Zariel
  #603 = Utf8               Zariel
  #604 = String             #605          // Alina
  #605 = Utf8               Alina
  #606 = String             #607          // Aris
  #607 = Utf8               Aris
  #608 = String             #609          // Miria
  #609 = Utf8               Miria
  #610 = String             #611          // Velina
  #611 = Utf8               Velina
  #612 = String             #613          // Tiriel
  #613 = Utf8               Tiriel
  #614 = String             #615          // Esme
  #615 = Utf8               Esme
  #616 = String             #617          // Naela
  #617 = Utf8               Naela
  #618 = String             #619          // Arwen
  #619 = Utf8               Arwen
  #620 = String             #621          // Leira
  #621 = Utf8               Leira
  #622 = String             #623          // Shayra
  #623 = Utf8               Shayra
  #624 = String             #625          // Virelle
  #625 = Utf8               Virelle
  #626 = String             #627          // Azura
  #627 = Utf8               Azura
  #628 = String             #629          // Narella
  #629 = Utf8               Narella
  #630 = String             #631          // Evelis
  #631 = Utf8               Evelis
  #632 = String             #633          // Rowena
  #633 = Utf8               Rowena
  #634 = String             #635          // Zyana
  #635 = Utf8               Zyana
  #636 = String             #637          // Orielle
  #637 = Utf8               Orielle
  #638 = String             #639          // Maeryn
  #639 = Utf8               Maeryn
  #640 = String             #641          // Selira
  #641 = Utf8               Selira
  #642 = String             #643          // Ylva
  #643 = Utf8               Ylva
  #644 = String             #645          // Cassira
  #645 = Utf8               Cassira
  #646 = String             #647          // Thessara
  #647 = Utf8               Thessara
  #648 = String             #649          // Iria
  #649 = Utf8               Iria
  #650 = String             #651          // Mireya
  #651 = Utf8               Mireya
  #652 = String             #653          // Arlen
  #653 = Utf8               Arlen
  #654 = String             #655          // Tahlira
  #655 = Utf8               Tahlira
  #656 = String             #657          // Kariel
  #657 = Utf8               Kariel
  #658 = String             #659          // Isilme
  #659 = Utf8               Isilme
  #660 = String             #661          // Evalyn
  #661 = Utf8               Evalyn
  #662 = String             #663          // Sarina
  #663 = Utf8               Sarina
  #664 = String             #665          // Zeyla
  #665 = Utf8               Zeyla
  #666 = String             #667          // Adalyn
  #667 = Utf8               Adalyn
  #668 = String             #669          // Luneth
  #669 = Utf8               Luneth
  #670 = String             #671          // Arianne
  #671 = Utf8               Arianne
  #672 = String             #673          // Cerys
  #673 = Utf8               Cerys
  #674 = String             #675          // Kalira
  #675 = Utf8               Kalira
  #676 = String             #677          // Thalira
  #677 = Utf8               Thalira
  #678 = String             #679          // Morwen
  #679 = Utf8               Morwen
  #680 = String             #681          // Velaria
  #681 = Utf8               Velaria
  #682 = String             #683          // Ysera
  #683 = Utf8               Ysera
  #684 = String             #685          // Eowyn
  #685 = Utf8               Eowyn
  #686 = String             #687          // Shyria
  #687 = Utf8               Shyria
  #688 = String             #689          // Ellaria
  #689 = Utf8               Ellaria
  #690 = String             #691          // Nerina
  #691 = Utf8               Nerina
  #692 = String             #693          // Faelina
  #693 = Utf8               Faelina
  #694 = String             #695          // Kalyra
  #695 = Utf8               Kalyra
  #696 = String             #697          // Aliona
  #697 = Utf8               Aliona
  #698 = String             #699          // Delya
  #699 = Utf8               Delya
  #700 = String             #701          // Vaelora
  #701 = Utf8               Vaelora
  #702 = String             #703          // Illyra
  #703 = Utf8               Illyra
  #704 = String             #705          // Serilda
  #705 = Utf8               Serilda
  #706 = String             #707          // Aerisyl
  #707 = Utf8               Aerisyl
  #708 = String             #709          // Myrren
  #709 = Utf8               Myrren
  #710 = String             #711          // Lunaria
  #711 = Utf8               Lunaria
  #712 = String             #713          // Elaya
  #713 = Utf8               Elaya
  #714 = String             #715          // Anwyn
  #715 = Utf8               Anwyn
  #716 = String             #717          // Caerwyn
  #717 = Utf8               Caerwyn
  #718 = String             #719          // Aurelia
  #719 = Utf8               Aurelia
  #720 = String             #721          // Elaria
  #721 = Utf8               Elaria
  #722 = String             #723          // Nymeria
  #723 = Utf8               Nymeria
  #724 = String             #725          // Mirellia
  #725 = Utf8               Mirellia
  #726 = String             #727          // Thalara
  #727 = Utf8               Thalara
  #728 = String             #729          // Saelis
  #729 = Utf8               Saelis
  #730 = String             #731          // Velwyn
  #731 = Utf8               Velwyn
  #732 = String             #733          // Zyra
  #733 = Utf8               Zyra
  #734 = String             #735          // Kalista
  #735 = Utf8               Kalista
  #736 = String             #737          // Virelia
  #737 = Utf8               Virelia
  #738 = String             #739          // Nelyra
  #739 = Utf8               Nelyra
  #740 = String             #741          // Aurelle
  #741 = Utf8               Aurelle
  #742 = String             #743          // Celina
  #743 = Utf8               Celina
  #744 = String             #745          // Isolyn
  #745 = Utf8               Isolyn
  #746 = String             #747          // Kalyndra
  #747 = Utf8               Kalyndra
  #748 = String             #749          // Liorael
  #749 = Utf8               Liorael
  #750 = String             #751          // Saphyrah
  #751 = Utf8               Saphyrah
  #752 = String             #753          // Maeriel
  #753 = Utf8               Maeriel
  #754 = String             #755          // Thenyra
  #755 = Utf8               Thenyra
  #756 = String             #757          // Ysara
  #757 = Utf8               Ysara
  #758 = String             #759          // Aralya
  #759 = Utf8               Aralya
  #760 = String             #761          // Oriana
  #761 = Utf8               Oriana
  #762 = String             #763          // Azshara
  #763 = Utf8               Azshara
  #764 = String             #765          // Lyrelle
  #765 = Utf8               Lyrelle
  #766 = String             #767          // Eireen
  #767 = Utf8               Eireen
  #768 = String             #769          // Kirelle
  #769 = Utf8               Kirelle
  #770 = String             #771          // Yllari
  #771 = Utf8               Yllari
  #772 = String             #773          // Elariel
  #773 = Utf8               Elariel
  #774 = String             #775          // Seliora
  #775 = Utf8               Seliora
  #776 = String             #777          // Mirelith
  #777 = Utf8               Mirelith
  #778 = String             #779          // Thenyssa
  #779 = Utf8               Thenyssa
  #780 = String             #781          // Ziriel
  #781 = Utf8               Ziriel
  #782 = String             #783          // Isylle
  #783 = Utf8               Isylle
  #784 = String             #785          // Amelith
  #785 = Utf8               Amelith
  #786 = String             #787          // Vaenara
  #787 = Utf8               Vaenara
  #788 = String             #789          // Felyra
  #789 = Utf8               Felyra
  #790 = String             #791          // Talindra
  #791 = Utf8               Talindra
  #792 = String             #793          // Naerwyn
  #793 = Utf8               Naerwyn
  #794 = String             #795          // Oralyn
  #795 = Utf8               Oralyn
  #796 = String             #797          // Mireva
  #797 = Utf8               Mireva
  #798 = String             #799          // Lyanna
  #799 = Utf8               Lyanna
  #800 = String             #801          // Sylria
  #801 = Utf8               Sylria
  #802 = String             #803          // Kalyssa
  #803 = Utf8               Kalyssa
  #804 = String             #805          // Velissa
  #805 = Utf8               Velissa
  #806 = String             #807          // Celestra
  #807 = Utf8               Celestra
  #808 = String             #809          // Mylenne
  #809 = Utf8               Mylenne
  #810 = String             #811          // Nysalia
  #811 = Utf8               Nysalia
  #812 = String             #813          // Vaelith
  #813 = Utf8               Vaelith
  #814 = String             #815          // Aeriselle
  #815 = Utf8               Aeriselle
  #816 = Utf8               Signature
  #817 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #818 = Utf8               Code
  #819 = Utf8               LineNumberTable
  #820 = Utf8               LocalVariableTable
  #821 = Utf8               this
  #822 = Utf8               Lext/mods/fakeplayer/FakePlayerNames;
  #823 = Utf8               getUniqueName
  #824 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
  #825 = Utf8               name
  #826 = Utf8               Ljava/lang/String;
  #827 = Utf8               sex
  #828 = Utf8               sourceList
  #829 = Utf8               copy
  #830 = Utf8               LocalVariableTypeTable
  #831 = Utf8               StackMapTable
  #832 = Utf8               releaseName
  #833 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
  #834 = Utf8               <clinit>
  #835 = Utf8               SourceFile
  #836 = Utf8               FakePlayerNames.java
{
  public ext.mods.fakeplayer.FakePlayerNames();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/FakePlayerNames;

  public static java.lang.String getUniqueName(ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
         4: if_acmpne     13
         7: getstatic     #13                 // Field MALE_NAMES:Ljava/util/List;
        10: goto          16
        13: getstatic     #19                 // Field FEMALE_NAMES:Ljava/util/List;
        16: astore_1
        17: aload_1
        18: invokeinterface #22,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        23: ifeq          28
        26: aconst_null
        27: areturn
        28: new           #28                 // class java/util/ArrayList
        31: dup
        32: aload_1
        33: invokespecial #30                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        36: astore_2
        37: aload_2
        38: invokeinterface #33,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        43: astore_3
        44: aload_3
        45: invokeinterface #37,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          101
        53: aload_3
        54: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        59: checkcast     #46                 // class java/lang/String
        62: astore        4
        64: invokestatic  #48                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        67: aload         4
        69: invokevirtual #54                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
        72: ifle          78
        75: goto          44
        78: aload_1
        79: aload         4
        81: invokeinterface #58,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        86: pop
        87: getstatic     #62                 // Field USED_NAMES:Ljava/util/List;
        90: aload         4
        92: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        97: pop
        98: aload         4
       100: areturn
       101: aconst_null
       102: areturn
      LineNumberTable:
        line 41: 0
        line 43: 17
        line 44: 26
        line 46: 28
        line 48: 37
        line 51: 64
        line 52: 75
        line 54: 78
        line 55: 87
        line 56: 98
        line 59: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      37     4  name   Ljava/lang/String;
            0     103     0   sex   Lext/mods/gameserver/enums/actors/Sex;
           17      86     1 sourceList   Ljava/util/List;
           37      66     2  copy   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      86     1 sourceList   Ljava/util/List<Ljava/lang/String;>;
           37      66     2  copy   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 6
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/List ]
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 22

  public static void releaseName(java.lang.String, ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: ifnull        11
         4: aload_0
         5: invokevirtual #68                 // Method java/lang/String.isEmpty:()Z
         8: ifeq          12
        11: return
        12: getstatic     #62                 // Field USED_NAMES:Ljava/util/List;
        15: aload_0
        16: invokeinterface #58,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        21: ifeq          66
        24: aload_1
        25: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
        28: if_acmpne     50
        31: getstatic     #13                 // Field MALE_NAMES:Ljava/util/List;
        34: aload_0
        35: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        40: pop
        41: getstatic     #13                 // Field MALE_NAMES:Ljava/util/List;
        44: invokestatic  #69                 // Method java/util/Collections.sort:(Ljava/util/List;)V
        47: goto          66
        50: getstatic     #19                 // Field FEMALE_NAMES:Ljava/util/List;
        53: aload_0
        54: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        59: pop
        60: getstatic     #19                 // Field FEMALE_NAMES:Ljava/util/List;
        63: invokestatic  #69                 // Method java/util/Collections.sort:(Ljava/util/List;)V
        66: return
      LineNumberTable:
        line 64: 0
        line 65: 11
        line 67: 12
        line 69: 24
        line 71: 31
        line 72: 41
        line 76: 50
        line 77: 60
        line 81: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  name   Ljava/lang/String;
            0      67     1   sex   Lext/mods/gameserver/enums/actors/Sex;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 37 /* same */
        frame_type = 15 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #28                 // class java/util/ArrayList
         3: dup
         4: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
         7: putstatic     #13                 // Field MALE_NAMES:Ljava/util/List;
        10: new           #28                 // class java/util/ArrayList
        13: dup
        14: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
        17: putstatic     #19                 // Field FEMALE_NAMES:Ljava/util/List;
        20: new           #28                 // class java/util/ArrayList
        23: dup
        24: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
        27: putstatic     #62                 // Field USED_NAMES:Ljava/util/List;
        30: getstatic     #13                 // Field MALE_NAMES:Ljava/util/List;
        33: sipush        190
        36: anewarray     #46                 // class java/lang/String
        39: dup
        40: iconst_0
        41: ldc           #76                 // String Arthur
        43: aastore
        44: dup
        45: iconst_1
        46: ldc           #78                 // String Lucian
        48: aastore
        49: dup
        50: iconst_2
        51: ldc           #80                 // String Draven
        53: aastore
        54: dup
        55: iconst_3
        56: ldc           #82                 // String Garen
        58: aastore
        59: dup
        60: iconst_4
        61: ldc           #84                 // String Valen
        63: aastore
        64: dup
        65: iconst_5
        66: ldc           #86                 // String Kael
        68: aastore
        69: dup
        70: bipush        6
        72: ldc           #88                 // String Darius
        74: aastore
        75: dup
        76: bipush        7
        78: ldc           #90                 // String Talon
        80: aastore
        81: dup
        82: bipush        8
        84: ldc           #92                 // String Alaric
        86: aastore
        87: dup
        88: bipush        9
        90: ldc           #94                 // String Thorne
        92: aastore
        93: dup
        94: bipush        10
        96: ldc           #96                 // String Cedric
        98: aastore
        99: dup
       100: bipush        11
       102: ldc           #98                 // String Theron
       104: aastore
       105: dup
       106: bipush        12
       108: ldc           #100                // String Leoric
       110: aastore
       111: dup
       112: bipush        13
       114: ldc           #102                // String Balthazar
       116: aastore
       117: dup
       118: bipush        14
       120: ldc           #104                // String Rowan
       122: aastore
       123: dup
       124: bipush        15
       126: ldc           #106                // String Aedric
       128: aastore
       129: dup
       130: bipush        16
       132: ldc           #108                // String Corwin
       134: aastore
       135: dup
       136: bipush        17
       138: ldc           #110                // String Sylas
       140: aastore
       141: dup
       142: bipush        18
       144: ldc           #112                // String Orin
       146: aastore
       147: dup
       148: bipush        19
       150: ldc           #114                // String Thalion
       152: aastore
       153: dup
       154: bipush        20
       156: ldc           #116                // String Ronan
       158: aastore
       159: dup
       160: bipush        21
       162: ldc           #118                // String Evander
       164: aastore
       165: dup
       166: bipush        22
       168: ldc           #120                // String Fenris
       170: aastore
       171: dup
       172: bipush        23
       174: ldc           #122                // String Kaelen
       176: aastore
       177: dup
       178: bipush        24
       180: ldc           #124                // String Auron
       182: aastore
       183: dup
       184: bipush        25
       186: ldc           #126                // String Gideon
       188: aastore
       189: dup
       190: bipush        26
       192: ldc           #128                // String Malric
       194: aastore
       195: dup
       196: bipush        27
       198: ldc           #130                // String Hadrian
       200: aastore
       201: dup
       202: bipush        28
       204: ldc           #132                // String Tyrion
       206: aastore
       207: dup
       208: bipush        29
       210: ldc           #134                // String Cassian
       212: aastore
       213: dup
       214: bipush        30
       216: ldc           #136                // String Eryk
       218: aastore
       219: dup
       220: bipush        31
       222: ldc           #138                // String Ashur
       224: aastore
       225: dup
       226: bipush        32
       228: ldc           #140                // String Soren
       230: aastore
       231: dup
       232: bipush        33
       234: ldc           #142                // String Lucius
       236: aastore
       237: dup
       238: bipush        34
       240: ldc           #144                // String Kieran
       242: aastore
       243: dup
       244: bipush        35
       246: ldc           #146                // String Elias
       248: aastore
       249: dup
       250: bipush        36
       252: ldc           #148                // String Zephyr
       254: aastore
       255: dup
       256: bipush        37
       258: ldc           #150                // String Varek
       260: aastore
       261: dup
       262: bipush        38
       264: ldc           #152                // String Calen
       266: aastore
       267: dup
       268: bipush        39
       270: ldc           #154                // String Renar
       272: aastore
       273: dup
       274: bipush        40
       276: ldc           #156                // String Magnus
       278: aastore
       279: dup
       280: bipush        41
       282: ldc           #158                // String Daelen
       284: aastore
       285: dup
       286: bipush        42
       288: ldc           #160                // String Beren
       290: aastore
       291: dup
       292: bipush        43
       294: ldc           #162                // String Torin
       296: aastore
       297: dup
       298: bipush        44
       300: ldc           #164                // String Xander
       302: aastore
       303: dup
       304: bipush        45
       306: ldc           #166                // String Aric
       308: aastore
       309: dup
       310: bipush        46
       312: ldc           #168                // String Ryder
       314: aastore
       315: dup
       316: bipush        47
       318: ldc           #170                // String Drake
       320: aastore
       321: dup
       322: bipush        48
       324: ldc           #172                // String Jareth
       326: aastore
       327: dup
       328: bipush        49
       330: ldc           #174                // String Thane
       332: aastore
       333: dup
       334: bipush        50
       336: ldc           #176                // String Varric
       338: aastore
       339: dup
       340: bipush        51
       342: ldc           #178                // String Iskandar
       344: aastore
       345: dup
       346: bipush        52
       348: ldc           #180                // String Lorien
       350: aastore
       351: dup
       352: bipush        53
       354: ldc           #182                // String Kellen
       356: aastore
       357: dup
       358: bipush        54
       360: ldc           #184                // String Alistair
       362: aastore
       363: dup
       364: bipush        55
       366: ldc           #186                // String Braeden
       368: aastore
       369: dup
       370: bipush        56
       372: ldc           #188                // String Mael
       374: aastore
       375: dup
       376: bipush        57
       378: ldc           #190                // String Jarek
       380: aastore
       381: dup
       382: bipush        58
       384: ldc           #192                // String Ravyn
       386: aastore
       387: dup
       388: bipush        59
       390: ldc           #194                // String Zarek
       392: aastore
       393: dup
       394: bipush        60
       396: ldc           #196                // String Caelum
       398: aastore
       399: dup
       400: bipush        61
       402: ldc           #94                 // String Thorne
       404: aastore
       405: dup
       406: bipush        62
       408: ldc           #198                // String Nikolai
       410: aastore
       411: dup
       412: bipush        63
       414: ldc           #200                // String Damon
       416: aastore
       417: dup
       418: bipush        64
       420: ldc           #122                // String Kaelen
       422: aastore
       423: dup
       424: bipush        65
       426: ldc           #202                // String Lucan
       428: aastore
       429: dup
       430: bipush        66
       432: ldc           #204                // String Aleron
       434: aastore
       435: dup
       436: bipush        67
       438: ldc           #206                // String Zane
       440: aastore
       441: dup
       442: bipush        68
       444: ldc           #208                // String Eron
       446: aastore
       447: dup
       448: bipush        69
       450: ldc           #210                // String Kalen
       452: aastore
       453: dup
       454: bipush        70
       456: ldc           #212                // String Rurik
       458: aastore
       459: dup
       460: bipush        71
       462: ldc           #90                 // String Talon
       464: aastore
       465: dup
       466: bipush        72
       468: ldc           #214                // String Galen
       470: aastore
       471: dup
       472: bipush        73
       474: ldc           #216                // String Caspian
       476: aastore
       477: dup
       478: bipush        74
       480: ldc           #218                // String Jax
       482: aastore
       483: dup
       484: bipush        75
       486: ldc           #220                // String Orion
       488: aastore
       489: dup
       490: bipush        76
       492: ldc           #222                // String Eamon
       494: aastore
       495: dup
       496: bipush        77
       498: ldc           #224                // String Veyron
       500: aastore
       501: dup
       502: bipush        78
       504: ldc           #226                // String Malik
       506: aastore
       507: dup
       508: bipush        79
       510: ldc           #228                // String Korrin
       512: aastore
       513: dup
       514: bipush        80
       516: ldc           #230                // String Sirius
       518: aastore
       519: dup
       520: bipush        81
       522: ldc           #232                // String Kaine
       524: aastore
       525: dup
       526: bipush        82
       528: ldc           #234                // String Oberyn
       530: aastore
       531: dup
       532: bipush        83
       534: ldc           #236                // String Therin
       536: aastore
       537: dup
       538: bipush        84
       540: ldc           #238                // String Tristan
       542: aastore
       543: dup
       544: bipush        85
       546: ldc           #240                // String Roland
       548: aastore
       549: dup
       550: bipush        86
       552: ldc           #242                // String Eldric
       554: aastore
       555: dup
       556: bipush        87
       558: ldc           #244                // String Zeth
       560: aastore
       561: dup
       562: bipush        88
       564: ldc           #246                // String Luther
       566: aastore
       567: dup
       568: bipush        89
       570: ldc           #248                // String Darion
       572: aastore
       573: dup
       574: bipush        90
       576: ldc           #250                // String Tiberius
       578: aastore
       579: dup
       580: bipush        91
       582: ldc           #252                // String Falkor
       584: aastore
       585: dup
       586: bipush        92
       588: ldc           #254                // String Leif
       590: aastore
       591: dup
       592: bipush        93
       594: ldc_w         #256                // String Aeron
       597: aastore
       598: dup
       599: bipush        94
       601: ldc_w         #258                // String Gavriel
       604: aastore
       605: dup
       606: bipush        95
       608: ldc_w         #260                // String Myron
       611: aastore
       612: dup
       613: bipush        96
       615: ldc_w         #262                // String Quint
       618: aastore
       619: dup
       620: bipush        97
       622: ldc_w         #264                // String Torren
       625: aastore
       626: dup
       627: bipush        98
       629: ldc_w         #266                // String Rhett
       632: aastore
       633: dup
       634: bipush        99
       636: ldc_w         #268                // String Hawke
       639: aastore
       640: dup
       641: bipush        100
       643: ldc_w         #270                // String Kelric
       646: aastore
       647: dup
       648: bipush        101
       650: ldc_w         #272                // String Dain
       653: aastore
       654: dup
       655: bipush        102
       657: ldc_w         #274                // String Caius
       660: aastore
       661: dup
       662: bipush        103
       664: ldc_w         #276                // String Ignis
       667: aastore
       668: dup
       669: bipush        104
       671: ldc_w         #278                // String Drael
       674: aastore
       675: dup
       676: bipush        105
       678: ldc_w         #280                // String Arden
       681: aastore
       682: dup
       683: bipush        106
       685: ldc_w         #282                // String Merek
       688: aastore
       689: dup
       690: bipush        107
       692: ldc_w         #284                // String Sylvain
       695: aastore
       696: dup
       697: bipush        108
       699: ldc_w         #286                // String Jorik
       702: aastore
       703: dup
       704: bipush        109
       706: ldc_w         #288                // String Brann
       709: aastore
       710: dup
       711: bipush        110
       713: ldc_w         #290                // String Corvus
       716: aastore
       717: dup
       718: bipush        111
       720: ldc_w         #292                // String Thalos
       723: aastore
       724: dup
       725: bipush        112
       727: ldc_w         #294                // String Riven
       730: aastore
       731: dup
       732: bipush        113
       734: ldc_w         #296                // String Darrek
       737: aastore
       738: dup
       739: bipush        114
       741: ldc_w         #298                // String Keldor
       744: aastore
       745: dup
       746: bipush        115
       748: ldc_w         #300                // String Judas
       751: aastore
       752: dup
       753: bipush        116
       755: ldc_w         #302                // String Blaine
       758: aastore
       759: dup
       760: bipush        117
       762: ldc_w         #304                // String Kaemon
       765: aastore
       766: dup
       767: bipush        118
       769: ldc_w         #306                // String Andros
       772: aastore
       773: dup
       774: bipush        119
       776: ldc_w         #308                // String Xavian
       779: aastore
       780: dup
       781: bipush        120
       783: ldc_w         #310                // String Zoren
       786: aastore
       787: dup
       788: bipush        121
       790: ldc_w         #312                // String Laziel
       793: aastore
       794: dup
       795: bipush        122
       797: ldc_w         #314                // String Garrick
       800: aastore
       801: dup
       802: bipush        123
       804: ldc_w         #316                // String Darian
       807: aastore
       808: dup
       809: bipush        124
       811: ldc_w         #318                // String Tavon
       814: aastore
       815: dup
       816: bipush        125
       818: ldc_w         #320                // String Aziel
       821: aastore
       822: dup
       823: bipush        126
       825: ldc_w         #322                // String Korran
       828: aastore
       829: dup
       830: bipush        127
       832: ldc_w         #324                // String Cael
       835: aastore
       836: dup
       837: sipush        128
       840: ldc_w         #326                // String Zephyrus
       843: aastore
       844: dup
       845: sipush        129
       848: ldc_w         #328                // String Emric
       851: aastore
       852: dup
       853: sipush        130
       856: ldc_w         #330                // String Lazrus
       859: aastore
       860: dup
       861: sipush        131
       864: ldc_w         #332                // String Hadrik
       867: aastore
       868: dup
       869: sipush        132
       872: ldc_w         #334                // String Fenrik
       875: aastore
       876: dup
       877: sipush        133
       880: ldc_w         #336                // String Cyrus
       883: aastore
       884: dup
       885: sipush        134
       888: ldc_w         #338                // String Malthus
       891: aastore
       892: dup
       893: sipush        135
       896: ldc_w         #340                // String Drystan
       899: aastore
       900: dup
       901: sipush        136
       904: ldc_w         #342                // String Orren
       907: aastore
       908: dup
       909: sipush        137
       912: ldc_w         #344                // String Rhogar
       915: aastore
       916: dup
       917: sipush        138
       920: ldc           #114                // String Thalion
       922: aastore
       923: dup
       924: sipush        139
       927: ldc_w         #346                // String Taran
       930: aastore
       931: dup
       932: sipush        140
       935: ldc_w         #348                // String Brynden
       938: aastore
       939: dup
       940: sipush        141
       943: ldc_w         #350                // String Quorin
       946: aastore
       947: dup
       948: sipush        142
       951: ldc_w         #352                // String Eryndor
       954: aastore
       955: dup
       956: sipush        143
       959: ldc_w         #354                // String Cassiel
       962: aastore
       963: dup
       964: sipush        144
       967: ldc_w         #356                // String Marek
       970: aastore
       971: dup
       972: sipush        145
       975: ldc_w         #358                // String Roderic
       978: aastore
       979: dup
       980: sipush        146
       983: ldc_w         #360                // String Davor
       986: aastore
       987: dup
       988: sipush        147
       991: ldc_w         #362                // String Veylin
       994: aastore
       995: dup
       996: sipush        148
       999: ldc_w         #364                // String Zadric
      1002: aastore
      1003: dup
      1004: sipush        149
      1007: ldc_w         #366                // String Khalen
      1010: aastore
      1011: dup
      1012: sipush        150
      1015: ldc_w         #368                // String Alarion
      1018: aastore
      1019: dup
      1020: sipush        151
      1023: ldc_w         #370                // String Morthos
      1026: aastore
      1027: dup
      1028: sipush        152
      1031: ldc_w         #372                // String Ithran
      1034: aastore
      1035: dup
      1036: sipush        153
      1039: ldc_w         #374                // String Vrael
      1042: aastore
      1043: dup
      1044: sipush        154
      1047: ldc_w         #376                // String Tirion
      1050: aastore
      1051: dup
      1052: sipush        155
      1055: ldc_w         #378                // String Gareth
      1058: aastore
      1059: dup
      1060: sipush        156
      1063: ldc_w         #380                // String Durion
      1066: aastore
      1067: dup
      1068: sipush        157
      1071: ldc_w         #382                // String Kaedin
      1074: aastore
      1075: dup
      1076: sipush        158
      1079: ldc_w         #384                // String Thyr
      1082: aastore
      1083: dup
      1084: sipush        159
      1087: ldc_w         #386                // String Astar
      1090: aastore
      1091: dup
      1092: sipush        160
      1095: ldc           #212                // String Rurik
      1097: aastore
      1098: dup
      1099: sipush        161
      1102: ldc_w         #388                // String Aelric
      1105: aastore
      1106: dup
      1107: sipush        162
      1110: ldc_w         #390                // String Zale
      1113: aastore
      1114: dup
      1115: sipush        163
      1118: ldc_w         #392                // String Korvin
      1121: aastore
      1122: dup
      1123: sipush        164
      1126: ldc_w         #394                // String Vandor
      1129: aastore
      1130: dup
      1131: sipush        165
      1134: ldc_w         #396                // String Eryx
      1137: aastore
      1138: dup
      1139: sipush        166
      1142: ldc_w         #398                // String Belric
      1145: aastore
      1146: dup
      1147: sipush        167
      1150: ldc_w         #400                // String Fendrel
      1153: aastore
      1154: dup
      1155: sipush        168
      1158: ldc_w         #402                // String Kalem
      1161: aastore
      1162: dup
      1163: sipush        169
      1166: ldc_w         #404                // String Nyron
      1169: aastore
      1170: dup
      1171: sipush        170
      1174: ldc_w         #406                // String Sevrin
      1177: aastore
      1178: dup
      1179: sipush        171
      1182: ldc_w         #408                // String Orrick
      1185: aastore
      1186: dup
      1187: sipush        172
      1190: ldc_w         #410                // String Eirik
      1193: aastore
      1194: dup
      1195: sipush        173
      1198: ldc_w         #412                // String Torvyn
      1201: aastore
      1202: dup
      1203: sipush        174
      1206: ldc_w         #414                // String Halrik
      1209: aastore
      1210: dup
      1211: sipush        175
      1214: ldc_w         #416                // String Stryke
      1217: aastore
      1218: dup
      1219: sipush        176
      1222: ldc_w         #418                // String Vorn
      1225: aastore
      1226: dup
      1227: sipush        177
      1230: ldc_w         #420                // String Kadrin
      1233: aastore
      1234: dup
      1235: sipush        178
      1238: ldc_w         #422                // String Aethor
      1241: aastore
      1242: dup
      1243: sipush        179
      1246: ldc_w         #424                // String Dax
      1249: aastore
      1250: dup
      1251: sipush        180
      1254: ldc_w         #426                // String Griffin
      1257: aastore
      1258: dup
      1259: sipush        181
      1262: ldc_w         #428                // String Drelan
      1265: aastore
      1266: dup
      1267: sipush        182
      1270: ldc_w         #430                // String Kaesor
      1273: aastore
      1274: dup
      1275: sipush        183
      1278: ldc_w         #432                // String Miran
      1281: aastore
      1282: dup
      1283: sipush        184
      1286: ldc_w         #434                // String Jorvan
      1289: aastore
      1290: dup
      1291: sipush        185
      1294: ldc_w         #436                // String Balen
      1297: aastore
      1298: dup
      1299: sipush        186
      1302: ldc_w         #438                // String Rowrick
      1305: aastore
      1306: dup
      1307: sipush        187
      1310: ldc_w         #440                // String Quintis
      1313: aastore
      1314: dup
      1315: sipush        188
      1318: ldc_w         #442                // String Sareth
      1321: aastore
      1322: dup
      1323: sipush        189
      1326: ldc_w         #444                // String Drelik
      1329: aastore
      1330: invokestatic  #446                // Method java/util/Collections.addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
      1333: pop
      1334: getstatic     #19                 // Field FEMALE_NAMES:Ljava/util/List;
      1337: sipush        190
      1340: anewarray     #46                 // class java/lang/String
      1343: dup
      1344: iconst_0
      1345: ldc_w         #450                // String Luna
      1348: aastore
      1349: dup
      1350: iconst_1
      1351: ldc_w         #452                // String Selene
      1354: aastore
      1355: dup
      1356: iconst_2
      1357: ldc_w         #454                // String Aurora
      1360: aastore
      1361: dup
      1362: iconst_3
      1363: ldc_w         #456                // String Freya
      1366: aastore
      1367: dup
      1368: iconst_4
      1369: ldc_w         #458                // String Lilith
      1372: aastore
      1373: dup
      1374: iconst_5
      1375: ldc_w         #460                // String Seraphina
      1378: aastore
      1379: dup
      1380: bipush        6
      1382: ldc_w         #462                // String Isolde
      1385: aastore
      1386: dup
      1387: bipush        7
      1389: ldc_w         #464                // String Elira
      1392: aastore
      1393: dup
      1394: bipush        8
      1396: ldc_w         #466                // String Nyx
      1399: aastore
      1400: dup
      1401: bipush        9
      1403: ldc_w         #468                // String Kairi
      1406: aastore
      1407: dup
      1408: bipush        10
      1410: ldc_w         #470                // String Aeliana
      1413: aastore
      1414: dup
      1415: bipush        11
      1417: ldc_w         #472                // String Thalia
      1420: aastore
      1421: dup
      1422: bipush        12
      1424: ldc_w         #474                // String Lyra
      1427: aastore
      1428: dup
      1429: bipush        13
      1431: ldc_w         #476                // String Ravena
      1434: aastore
      1435: dup
      1436: bipush        14
      1438: ldc_w         #478                // String Sylva
      1441: aastore
      1442: dup
      1443: bipush        15
      1445: ldc_w         #480                // String Celeste
      1448: aastore
      1449: dup
      1450: bipush        16
      1452: ldc_w         #482                // String Aria
      1455: aastore
      1456: dup
      1457: bipush        17
      1459: ldc_w         #484                // String Eira
      1462: aastore
      1463: dup
      1464: bipush        18
      1466: ldc_w         #486                // String Zafira
      1469: aastore
      1470: dup
      1471: bipush        19
      1473: ldc_w         #488                // String Maelis
      1476: aastore
      1477: dup
      1478: bipush        20
      1480: ldc_w         #490                // String Ysolde
      1483: aastore
      1484: dup
      1485: bipush        21
      1487: ldc_w         #492                // String Vespera
      1490: aastore
      1491: dup
      1492: bipush        22
      1494: ldc_w         #494                // String Melisande
      1497: aastore
      1498: dup
      1499: bipush        23
      1501: ldc_w         #496                // String Kaelia
      1504: aastore
      1505: dup
      1506: bipush        24
      1508: ldc_w         #498                // String Evelyne
      1511: aastore
      1512: dup
      1513: bipush        25
      1515: ldc_w         #500                // String Saphira
      1518: aastore
      1519: dup
      1520: bipush        26
      1522: ldc_w         #502                // String Mirelle
      1525: aastore
      1526: dup
      1527: bipush        27
      1529: ldc_w         #504                // String Calista
      1532: aastore
      1533: dup
      1534: bipush        28
      1536: ldc_w         #506                // String Aeris
      1539: aastore
      1540: dup
      1541: bipush        29
      1543: ldc_w         #508                // String Naeris
      1546: aastore
      1547: dup
      1548: bipush        30
      1550: ldc_w         #510                // String Tahlia
      1553: aastore
      1554: dup
      1555: bipush        31
      1557: ldc_w         #512                // String Fiora
      1560: aastore
      1561: dup
      1562: bipush        32
      1564: ldc_w         #514                // String Liora
      1567: aastore
      1568: dup
      1569: bipush        33
      1571: ldc_w         #516                // String Mirabel
      1574: aastore
      1575: dup
      1576: bipush        34
      1578: ldc_w         #518                // String Zelena
      1581: aastore
      1582: dup
      1583: bipush        35
      1585: ldc_w         #520                // String Vanya
      1588: aastore
      1589: dup
      1590: bipush        36
      1592: ldc_w         #522                // String Elowen
      1595: aastore
      1596: dup
      1597: bipush        37
      1599: ldc_w         #524                // String Seren
      1602: aastore
      1603: dup
      1604: bipush        38
      1606: ldc_w         #526                // String Taliah
      1609: aastore
      1610: dup
      1611: bipush        39
      1613: ldc_w         #528                // String Ilyana
      1616: aastore
      1617: dup
      1618: bipush        40
      1620: ldc_w         #530                // String Nerissa
      1623: aastore
      1624: dup
      1625: bipush        41
      1627: ldc_w         #532                // String Anara
      1630: aastore
      1631: dup
      1632: bipush        42
      1634: ldc_w         #534                // String Coraline
      1637: aastore
      1638: dup
      1639: bipush        43
      1641: ldc_w         #536                // String Brielle
      1644: aastore
      1645: dup
      1646: bipush        44
      1648: ldc_w         #538                // String Isara
      1651: aastore
      1652: dup
      1653: bipush        45
      1655: ldc_w         #540                // String Amaris
      1658: aastore
      1659: dup
      1660: bipush        46
      1662: ldc_w         #542                // String Zephyra
      1665: aastore
      1666: dup
      1667: bipush        47
      1669: ldc_w         #544                // String Orla
      1672: aastore
      1673: dup
      1674: bipush        48
      1676: ldc_w         #546                // String Lunara
      1679: aastore
      1680: dup
      1681: bipush        49
      1683: ldc_w         #548                // String Thessia
      1686: aastore
      1687: dup
      1688: bipush        50
      1690: ldc_w         #550                // String Aelith
      1693: aastore
      1694: dup
      1695: bipush        51
      1697: ldc_w         #552                // String Selindra
      1700: aastore
      1701: dup
      1702: bipush        52
      1704: ldc_w         #554                // String Kyria
      1707: aastore
      1708: dup
      1709: bipush        53
      1711: ldc_w         #556                // String Velena
      1714: aastore
      1715: dup
      1716: bipush        54
      1718: ldc_w         #558                // String Nimue
      1721: aastore
      1722: dup
      1723: bipush        55
      1725: ldc_w         #560                // String Saren
      1728: aastore
      1729: dup
      1730: bipush        56
      1732: ldc_w         #562                // String Eirlys
      1735: aastore
      1736: dup
      1737: bipush        57
      1739: ldc_w         #564                // String Vaela
      1742: aastore
      1743: dup
      1744: bipush        58
      1746: ldc_w         #566                // String Maris
      1749: aastore
      1750: dup
      1751: bipush        59
      1753: ldc_w         #568                // String Yrene
      1756: aastore
      1757: dup
      1758: bipush        60
      1760: ldc_w         #570                // String Alira
      1763: aastore
      1764: dup
      1765: bipush        61
      1767: ldc_w         #572                // String Sanya
      1770: aastore
      1771: dup
      1772: bipush        62
      1774: ldc_w         #514                // String Liora
      1777: aastore
      1778: dup
      1779: bipush        63
      1781: ldc_w         #574                // String Caelia
      1784: aastore
      1785: dup
      1786: bipush        64
      1788: ldc_w         #576                // String Elanil
      1791: aastore
      1792: dup
      1793: bipush        65
      1795: ldc_w         #578                // String Myra
      1798: aastore
      1799: dup
      1800: bipush        66
      1802: ldc_w         #580                // String Astrid
      1805: aastore
      1806: dup
      1807: bipush        67
      1809: ldc_w         #582                // String Dahlia
      1812: aastore
      1813: dup
      1814: bipush        68
      1816: ldc_w         #584                // String Kassia
      1819: aastore
      1820: dup
      1821: bipush        69
      1823: ldc_w         #586                // String Nyssa
      1826: aastore
      1827: dup
      1828: bipush        70
      1830: ldc_w         #588                // String Vaeria
      1833: aastore
      1834: dup
      1835: bipush        71
      1837: ldc_w         #590                // String Althea
      1840: aastore
      1841: dup
      1842: bipush        72
      1844: ldc_w         #592                // String Elaena
      1847: aastore
      1848: dup
      1849: bipush        73
      1851: ldc_w         #594                // String Saphyra
      1854: aastore
      1855: dup
      1856: bipush        74
      1858: ldc_w         #596                // String Meliora
      1861: aastore
      1862: dup
      1863: bipush        75
      1865: ldc_w         #598                // String Ishara
      1868: aastore
      1869: dup
      1870: bipush        76
      1872: ldc_w         #600                // String Nysa
      1875: aastore
      1876: dup
      1877: bipush        77
      1879: ldc_w         #602                // String Zariel
      1882: aastore
      1883: dup
      1884: bipush        78
      1886: ldc_w         #604                // String Alina
      1889: aastore
      1890: dup
      1891: bipush        79
      1893: ldc_w         #606                // String Aris
      1896: aastore
      1897: dup
      1898: bipush        80
      1900: ldc_w         #608                // String Miria
      1903: aastore
      1904: dup
      1905: bipush        81
      1907: ldc_w         #610                // String Velina
      1910: aastore
      1911: dup
      1912: bipush        82
      1914: ldc_w         #612                // String Tiriel
      1917: aastore
      1918: dup
      1919: bipush        83
      1921: ldc_w         #614                // String Esme
      1924: aastore
      1925: dup
      1926: bipush        84
      1928: ldc_w         #616                // String Naela
      1931: aastore
      1932: dup
      1933: bipush        85
      1935: ldc_w         #618                // String Arwen
      1938: aastore
      1939: dup
      1940: bipush        86
      1942: ldc_w         #506                // String Aeris
      1945: aastore
      1946: dup
      1947: bipush        87
      1949: ldc_w         #620                // String Leira
      1952: aastore
      1953: dup
      1954: bipush        88
      1956: ldc_w         #622                // String Shayra
      1959: aastore
      1960: dup
      1961: bipush        89
      1963: ldc_w         #624                // String Virelle
      1966: aastore
      1967: dup
      1968: bipush        90
      1970: ldc_w         #626                // String Azura
      1973: aastore
      1974: dup
      1975: bipush        91
      1977: ldc_w         #514                // String Liora
      1980: aastore
      1981: dup
      1982: bipush        92
      1984: ldc_w         #628                // String Narella
      1987: aastore
      1988: dup
      1989: bipush        93
      1991: ldc_w         #630                // String Evelis
      1994: aastore
      1995: dup
      1996: bipush        94
      1998: ldc_w         #632                // String Rowena
      2001: aastore
      2002: dup
      2003: bipush        95
      2005: ldc_w         #634                // String Zyana
      2008: aastore
      2009: dup
      2010: bipush        96
      2012: ldc_w         #636                // String Orielle
      2015: aastore
      2016: dup
      2017: bipush        97
      2019: ldc_w         #638                // String Maeryn
      2022: aastore
      2023: dup
      2024: bipush        98
      2026: ldc_w         #640                // String Selira
      2029: aastore
      2030: dup
      2031: bipush        99
      2033: ldc_w         #642                // String Ylva
      2036: aastore
      2037: dup
      2038: bipush        100
      2040: ldc_w         #644                // String Cassira
      2043: aastore
      2044: dup
      2045: bipush        101
      2047: ldc_w         #646                // String Thessara
      2050: aastore
      2051: dup
      2052: bipush        102
      2054: ldc_w         #648                // String Iria
      2057: aastore
      2058: dup
      2059: bipush        103
      2061: ldc_w         #650                // String Mireya
      2064: aastore
      2065: dup
      2066: bipush        104
      2068: ldc_w         #652                // String Arlen
      2071: aastore
      2072: dup
      2073: bipush        105
      2075: ldc_w         #654                // String Tahlira
      2078: aastore
      2079: dup
      2080: bipush        106
      2082: ldc_w         #656                // String Kariel
      2085: aastore
      2086: dup
      2087: bipush        107
      2089: ldc_w         #658                // String Isilme
      2092: aastore
      2093: dup
      2094: bipush        108
      2096: ldc_w         #660                // String Evalyn
      2099: aastore
      2100: dup
      2101: bipush        109
      2103: ldc_w         #662                // String Sarina
      2106: aastore
      2107: dup
      2108: bipush        110
      2110: ldc_w         #664                // String Zeyla
      2113: aastore
      2114: dup
      2115: bipush        111
      2117: ldc_w         #666                // String Adalyn
      2120: aastore
      2121: dup
      2122: bipush        112
      2124: ldc_w         #668                // String Luneth
      2127: aastore
      2128: dup
      2129: bipush        113
      2131: ldc_w         #670                // String Arianne
      2134: aastore
      2135: dup
      2136: bipush        114
      2138: ldc_w         #672                // String Cerys
      2141: aastore
      2142: dup
      2143: bipush        115
      2145: ldc_w         #674                // String Kalira
      2148: aastore
      2149: dup
      2150: bipush        116
      2152: ldc_w         #676                // String Thalira
      2155: aastore
      2156: dup
      2157: bipush        117
      2159: ldc_w         #678                // String Morwen
      2162: aastore
      2163: dup
      2164: bipush        118
      2166: ldc_w         #680                // String Velaria
      2169: aastore
      2170: dup
      2171: bipush        119
      2173: ldc_w         #682                // String Ysera
      2176: aastore
      2177: dup
      2178: bipush        120
      2180: ldc_w         #684                // String Eowyn
      2183: aastore
      2184: dup
      2185: bipush        121
      2187: ldc_w         #686                // String Shyria
      2190: aastore
      2191: dup
      2192: bipush        122
      2194: ldc_w         #688                // String Ellaria
      2197: aastore
      2198: dup
      2199: bipush        123
      2201: ldc_w         #488                // String Maelis
      2204: aastore
      2205: dup
      2206: bipush        124
      2208: ldc_w         #690                // String Nerina
      2211: aastore
      2212: dup
      2213: bipush        125
      2215: ldc_w         #692                // String Faelina
      2218: aastore
      2219: dup
      2220: bipush        126
      2222: ldc_w         #640                // String Selira
      2225: aastore
      2226: dup
      2227: bipush        127
      2229: ldc_w         #694                // String Kalyra
      2232: aastore
      2233: dup
      2234: sipush        128
      2237: ldc_w         #696                // String Aliona
      2240: aastore
      2241: dup
      2242: sipush        129
      2245: ldc_w         #698                // String Delya
      2248: aastore
      2249: dup
      2250: sipush        130
      2253: ldc_w         #700                // String Vaelora
      2256: aastore
      2257: dup
      2258: sipush        131
      2261: ldc_w         #702                // String Illyra
      2264: aastore
      2265: dup
      2266: sipush        132
      2269: ldc_w         #704                // String Serilda
      2272: aastore
      2273: dup
      2274: sipush        133
      2277: ldc_w         #706                // String Aerisyl
      2280: aastore
      2281: dup
      2282: sipush        134
      2285: ldc_w         #708                // String Myrren
      2288: aastore
      2289: dup
      2290: sipush        135
      2293: ldc_w         #710                // String Lunaria
      2296: aastore
      2297: dup
      2298: sipush        136
      2301: ldc_w         #712                // String Elaya
      2304: aastore
      2305: dup
      2306: sipush        137
      2309: ldc_w         #714                // String Anwyn
      2312: aastore
      2313: dup
      2314: sipush        138
      2317: ldc_w         #716                // String Caerwyn
      2320: aastore
      2321: dup
      2322: sipush        139
      2325: ldc_w         #718                // String Aurelia
      2328: aastore
      2329: dup
      2330: sipush        140
      2333: ldc_w         #720                // String Elaria
      2336: aastore
      2337: dup
      2338: sipush        141
      2341: ldc_w         #722                // String Nymeria
      2344: aastore
      2345: dup
      2346: sipush        142
      2349: ldc_w         #724                // String Mirellia
      2352: aastore
      2353: dup
      2354: sipush        143
      2357: ldc_w         #726                // String Thalara
      2360: aastore
      2361: dup
      2362: sipush        144
      2365: ldc_w         #728                // String Saelis
      2368: aastore
      2369: dup
      2370: sipush        145
      2373: ldc_w         #730                // String Velwyn
      2376: aastore
      2377: dup
      2378: sipush        146
      2381: ldc_w         #732                // String Zyra
      2384: aastore
      2385: dup
      2386: sipush        147
      2389: ldc_w         #734                // String Kalista
      2392: aastore
      2393: dup
      2394: sipush        148
      2397: ldc_w         #736                // String Virelia
      2400: aastore
      2401: dup
      2402: sipush        149
      2405: ldc_w         #738                // String Nelyra
      2408: aastore
      2409: dup
      2410: sipush        150
      2413: ldc_w         #740                // String Aurelle
      2416: aastore
      2417: dup
      2418: sipush        151
      2421: ldc_w         #742                // String Celina
      2424: aastore
      2425: dup
      2426: sipush        152
      2429: ldc_w         #744                // String Isolyn
      2432: aastore
      2433: dup
      2434: sipush        153
      2437: ldc_w         #746                // String Kalyndra
      2440: aastore
      2441: dup
      2442: sipush        154
      2445: ldc_w         #748                // String Liorael
      2448: aastore
      2449: dup
      2450: sipush        155
      2453: ldc_w         #750                // String Saphyrah
      2456: aastore
      2457: dup
      2458: sipush        156
      2461: ldc_w         #752                // String Maeriel
      2464: aastore
      2465: dup
      2466: sipush        157
      2469: ldc_w         #754                // String Thenyra
      2472: aastore
      2473: dup
      2474: sipush        158
      2477: ldc_w         #756                // String Ysara
      2480: aastore
      2481: dup
      2482: sipush        159
      2485: ldc_w         #758                // String Aralya
      2488: aastore
      2489: dup
      2490: sipush        160
      2493: ldc_w         #760                // String Oriana
      2496: aastore
      2497: dup
      2498: sipush        161
      2501: ldc_w         #762                // String Azshara
      2504: aastore
      2505: dup
      2506: sipush        162
      2509: ldc_w         #764                // String Lyrelle
      2512: aastore
      2513: dup
      2514: sipush        163
      2517: ldc_w         #766                // String Eireen
      2520: aastore
      2521: dup
      2522: sipush        164
      2525: ldc_w         #768                // String Kirelle
      2528: aastore
      2529: dup
      2530: sipush        165
      2533: ldc_w         #770                // String Yllari
      2536: aastore
      2537: dup
      2538: sipush        166
      2541: ldc_w         #772                // String Elariel
      2544: aastore
      2545: dup
      2546: sipush        167
      2549: ldc_w         #774                // String Seliora
      2552: aastore
      2553: dup
      2554: sipush        168
      2557: ldc_w         #776                // String Mirelith
      2560: aastore
      2561: dup
      2562: sipush        169
      2565: ldc_w         #778                // String Thenyssa
      2568: aastore
      2569: dup
      2570: sipush        170
      2573: ldc_w         #780                // String Ziriel
      2576: aastore
      2577: dup
      2578: sipush        171
      2581: ldc_w         #782                // String Isylle
      2584: aastore
      2585: dup
      2586: sipush        172
      2589: ldc_w         #784                // String Amelith
      2592: aastore
      2593: dup
      2594: sipush        173
      2597: ldc_w         #786                // String Vaenara
      2600: aastore
      2601: dup
      2602: sipush        174
      2605: ldc_w         #788                // String Felyra
      2608: aastore
      2609: dup
      2610: sipush        175
      2613: ldc_w         #790                // String Talindra
      2616: aastore
      2617: dup
      2618: sipush        176
      2621: ldc_w         #792                // String Naerwyn
      2624: aastore
      2625: dup
      2626: sipush        177
      2629: ldc_w         #794                // String Oralyn
      2632: aastore
      2633: dup
      2634: sipush        178
      2637: ldc_w         #796                // String Mireva
      2640: aastore
      2641: dup
      2642: sipush        179
      2645: ldc_w         #798                // String Lyanna
      2648: aastore
      2649: dup
      2650: sipush        180
      2653: ldc_w         #800                // String Sylria
      2656: aastore
      2657: dup
      2658: sipush        181
      2661: ldc_w         #802                // String Kalyssa
      2664: aastore
      2665: dup
      2666: sipush        182
      2669: ldc_w         #804                // String Velissa
      2672: aastore
      2673: dup
      2674: sipush        183
      2677: ldc_w         #806                // String Celestra
      2680: aastore
      2681: dup
      2682: sipush        184
      2685: ldc_w         #808                // String Mylenne
      2688: aastore
      2689: dup
      2690: sipush        185
      2693: ldc_w         #810                // String Nysalia
      2696: aastore
      2697: dup
      2698: sipush        186
      2701: ldc_w         #812                // String Vaelith
      2704: aastore
      2705: dup
      2706: sipush        187
      2709: ldc_w         #704                // String Serilda
      2712: aastore
      2713: dup
      2714: sipush        188
      2717: ldc_w         #814                // String Aeriselle
      2720: aastore
      2721: dup
      2722: sipush        189
      2725: ldc_w         #490                // String Ysolde
      2728: aastore
      2729: invokestatic  #446                // Method java/util/Collections.addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
      2732: pop
      2733: return
      LineNumberTable:
        line 29: 0
        line 30: 10
        line 31: 20
        line 35: 30
        line 36: 1334
        line 37: 2733
}
SourceFile: "FakePlayerNames.java"
