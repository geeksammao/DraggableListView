package net.bingyan.sammao.draggablelistview.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * A ListView enables users dragging list items to
 * different position.
 */
public class DraggableRecyclerView extends RecyclerView{
    public DraggableRecyclerView(Context context) {
        super(context);
    }

    public DraggableRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
