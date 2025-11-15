package rwcaddon.common.core.handler;

import rwcaddon.common.RWCAddon;

public class RWCAddonRollingStockEntityHandler {
    private Object Instance() { return RWCAddon.instance; }

    public RWCAddonRollingStockEntityHandler() {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.

    }
}
