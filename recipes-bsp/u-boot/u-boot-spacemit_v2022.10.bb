require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

inherit uboot-extlinux-config

LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

BRANCH:k1 = "v2022.10-k1-v2.0-dev"

SRC_URI = "git://github.com/BPI-SINOVOIP/pi-u-boot.git;protocol=https;nobranch=1 \
          "

SRCREV:k1 = "9b44b4505757fe53407fee1058e510aef80fdca4"

DEPENDS:append = " \
    u-boot-tools-native \
    python3-setuptools-native \
"

COMPATIBLE_MACHINE = "bananapi-bpi-f3"

do_compile() {
#    oe_runmake -C ${S} O=${B} k1_defconfig all
    oe_runmake -C ${S} k1_defconfig all
}

do_deploy() {
    install -m 644 ${S}/bootinfo_sd.bin ${DEPLOYDIR}
    install -m 644 ${S}/FSBL.bin ${DEPLOYDIR}
    install -m 644 ${S}/u-boot-env-default.bin ${DEPLOYDIR}
    install -m 644 ${S}/u-boot.itb ${DEPLOYDIR}
}

do_install() {
}

TOOLCHAIN = "gcc"
