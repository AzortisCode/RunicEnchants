package com.azortis.runicenchants.vcs;

import v10.Ver10;
import v12.Ver12;
import v13.Ver13;
import v14.Ver14;
import v15.Ver15;
import v9.Ver9;
import ver8.Ver8;

/**
 * @author X1XX on 4/1/2020
 * @project RunicEnchants
 **/
public enum Version {
    VERSION8(new Ver8()),
    VERSION9(new Ver9()),
    VERSION10(new Ver10()),
    VERSION12(new Ver12()),
    VERSION13(new Ver13()),
    VERSION14(new Ver14()),
    VERSION15(new Ver15());

    private Ver ver;

    Version(Ver ver) {
        this.ver = ver;
    }

    public Ver getVer() {
        return ver;
    }

    public static Version convert(String string) {
        if (string.contains("1_8")) {
            return VERSION8;
        } else if (string.contains("1_9")) {
            return VERSION9;
        } else if (string.contains("1_10")) {
            return VERSION10;
        } else if (string.contains("1_12")) {
            return VERSION12;
        } else if (string.contains("1_13")) {
            return VERSION13;
        } else if (string.contains("1_14")) {
            return VERSION14;
        } else if (string.contains("1_15")) {
            return VERSION15;
        }
        return VERSION8;
    }
}
