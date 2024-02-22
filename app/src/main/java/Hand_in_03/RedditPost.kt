package Hand_in_03

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class RedditPost(title: String, author: String): Comparable<RedditPost> {
    private val title: String = title;
    private val author: String = author;

    private var _votes: Int = 1;
    val votes: Int
        get() = _votes;

    @RequiresApi(Build.VERSION_CODES.O)
    private val _timestamp: String = LocalDateTime.now().toString();
    val timestamp: String
        @RequiresApi(Build.VERSION_CODES.O)
        get() = _timestamp;

    fun upvote(){
        _votes += 1;
    }
    fun downvote(){
        _votes -= 1;
    }
    override fun compareTo(other: RedditPost): Int {
        if (this.votes > other.votes){
            return 1;
        }
        else if (this.votes < other.votes){
            return -1;
        }
        else{
            return 0;
        }
    }

    override fun toString(): String {
        return title + " " + "votes: $votes";
    }
}