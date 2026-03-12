SUMMARY = "Mainline Linux Kernel for SpacemiT K1 boards"

require recipes-kernel/linux/linux-mainline-common.inc

DEPENDS += "u-boot-tools-native"

BRANCH = "linux-6.19.y"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=https;branch=${BRANCH} \
           file://nfs.cfg \
           file://misc.cfg \
          "

SRCREV ?= "6a753907865e35ae986b7b2ad48daa1eab4bcf3a"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION ?= "6.19.6"

KBUILD_DEFCONFIG ?= "defconfig"

COMPATIBLE_MACHINE = "(k1)"
