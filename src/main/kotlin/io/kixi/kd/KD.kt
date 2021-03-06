package io.kixi.kd

import java.io.*
import java.net.URL

/**
 * Utility class for KD
 */
class KD {
    companion object {

        /*
        fun value(text:String) : Any? {
            // TODO
        }
        */

        /**
         * Reads tags from the reader. If there is a single tag it is returned as is.
         * If there are multiple tags they are returned as children of a root tag
         * called "root";
         *
         * @throws ParseException
         */
        @JvmStatic fun read(reader: Reader) : Tag {
            val tags = Interpreter().read(reader)
            if(tags.size == 0) {
                return Tag("root")
            } else if(tags.size == 1) {
                return tags[0]
            } else {
                val tag = Tag("root")
                tag.children.addAll(tags)
                return tag;
            }
        }


        @JvmStatic fun read(text: String) : Tag = read(StringReader(text))
        @JvmStatic fun read(file: File) : Tag = read(FileReader(file))
        @JvmStatic fun read(url: URL) : Tag = read(url.readText())
        @JvmStatic fun readResource(resource:String) : Tag = read(this::class.java.
                getResource("/" + resource))
    }
}