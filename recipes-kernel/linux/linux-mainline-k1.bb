SUMMARY = "Mainline Linux Kernel for SpacemiT K1 boards"

require recipes-kernel/linux/linux-mainline-common.inc

DEPENDS += "u-boot-tools-native"

BRANCH = "linux-6.19.y"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=https;branch=${BRANCH} \
           file://0001-mmc-sdhci-of-k1-enable-essential-clock-infrastructur.patch \
           file://0002-mmc-sdhci-of-k1-add-regulator-and-pinctrl-voltage-sw.patch \
           file://0003-mmc-sdhci-of-k1-add-SDR-tuning-infrastructure.patch \
           file://0004-mmc-sdhci-of-k1-add-comprehensive-SDR-tuning-support.patch \
           file://0005-riscv-dts-spacemit-k1-add-SD-card-controller-and-pin.patch \
           file://0006-riscv-dts-spacemit-k1-orangepi-rv2-add-PMIC-and-powe.patch \
           file://0007-riscv-dts-spacemit-k1-orangepi-rv2-add-SD-card-suppo.patch \
           file://nfs.cfg \
           file://misc.cfg \
          "

SRCREV ?= "6a753907865e35ae986b7b2ad48daa1eab4bcf3a"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION ?= "6.19.6"

KBUILD_DEFCONFIG ?= "defconfig"

COMPATIBLE_MACHINE = "(k1)"
