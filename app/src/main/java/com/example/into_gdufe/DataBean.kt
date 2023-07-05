package com.example.into_gdufe

class DataBean {
    var imageRes: Int? = null
    var imageUrl: String? = null
    var title: String?
    var viewType: Int

    constructor(imageRes: Int?, title: String?, viewType: Int) {
        this.imageRes = imageRes
        this.title = title
        this.viewType = viewType
    }

    constructor(imageUrl: String?, title: String?, viewType: Int) {
        this.imageUrl = imageUrl
        this.title = title
        this.viewType = viewType
    }

    companion object {

        //测试数据，如果图片链接失效请更换
        //三水校区图书馆
        val testData3: List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/4AVUqYg5tNcC37L.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/ZMkpQuNr5Y2LoEs.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/ujWkd7ZrT2UJfEy.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/koYwxSsipEW8zGg.jpg",
                        null,
                        1
                    )
                )
                return list
            }

        //校徽 校训 校歌
        val xxxhxgData : List<DataBean>
            get() {
                val list1: MutableList<DataBean> = ArrayList()
                list1.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/1SN8olcjuRzAnUm.png",
                        null,
                        1
                    )
                )
                list1.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/onV5daTXRCwI63Y.png",
                        null,
                        1
                    )
                )
                list1.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/w7IiYU4VryhodvE.jpg",
                        null,
                        1
                    )
                )
                return list1
            }

        //三水校区 沁湖图片
        val qhData : List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/ac2vzOGfNMbA7Dm.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/7brOmgG5zyDhusA.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/H5h9b8W2gaONZFz.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/FzorBP87baQsyeK.jpg",
                        null,
                        1
                    )
                )
                return list
            }

        //三水校区校门
        val doorData :List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/A5xcK9NfykLYhql.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/15/T5uM2iytVhroxGf.jpg",
                        null,
                        1
                    )
                )
                return list
            }

        //广州校区 花
        val hData :List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/n4Pmx8iFXIHdjUO.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/iHeQ3fDMZKuNkTh.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/KC3Iv64zPeEOTw1.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/qKXxPmJYbMw6An8.jpg",
                        null,
                        1
                    )
                )
                return list
            }

        //广州图书馆
        val gzLibData :List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/Xl63vGdfwckQaoN.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/MNWTaF69HoPGRe3.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/eBTOZLiAkWJsu6D.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/ptiLZYJQFgPTHjG.jpg",
                        null,
                        1
                    )
                )
                return list
            }

        //广州校区
        val gzxqData :List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/GJD5eBaYWnwNLFs.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/nP1UzC3kEQNWK2v.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/ptiLZYJQFgPTHjG.jpg",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2022/12/14/tMHvR48ugPNS9sB.jpg",
                        null,
                        1
                    )
                )
                return list
            }

    }
}