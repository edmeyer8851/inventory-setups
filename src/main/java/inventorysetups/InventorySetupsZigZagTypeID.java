package inventorysetups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum InventorySetupsZigZagTypeID {
    //use if you want to withdraw using a top to bottom zigzag pattern
    Top_To_Bottom(0),

    // use if you want to withdraw using a bottom to top zigzag pattern
    Bottom_To_Top(1);

    private final int type;

    private static final List<InventorySetupsZigZagTypeID> VALUES;

    static
    {
        VALUES = new ArrayList<>();
        Collections.addAll(VALUES, InventorySetupsZigZagTypeID.values());
    }

    InventorySetupsZigZagTypeID(int type)
    {
        this.type = type;
    }

    public static List<InventorySetupsZigZagTypeID> getValues()
    {
        return VALUES;
    }
}
